package com.ljwd.plms.core.feature.orm.mybatis;

import org.apache.ibatis.builder.xml.XMLMapperBuilder;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.NestedIOException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * MyBatis Mapper XML变更检测并自动编译生效
 * <pre>
 * 必须注入SqlSessionFactory的实例
 * 该实例必须是Mybatis使用中的实例
 * 不可创建新实例,否则Mapper.xml变更后编译无效
 * </pre>
 * Created by tangjialin on 2016-11-02 0002.
 */
public class MybatisMapperRefresh implements java.lang.Runnable, InitializingBean {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private String refreshLocation = "mybatis-refresh.properties";
    private Resource refreshResource;            // 自动检测配置文件
    private long beforeTime = 0L;                // 上一次刷新时间
    private long delaySeconds;                   // 延迟刷新毫秒数
    private long sleepSeconds;                   // 休眠时间毫秒数
    private Set<String> reflectLoadedResources;  // MyBatis原始Mapper资源文件路径引用
    private Set<String> mapperResources;         // Mapper资源文件路径
    private Configuration configuration;         // MyBatis配置对象
    private SqlSessionFactory sqlSessionFactory; // Mybatis原始的SessionFactoryBean,此处保留其一个引用

    public MybatisMapperRefresh() {
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        InputStream resourceAsStream = null;
        try {
            if (sqlSessionFactory == null) { return; }
            refreshResource = refreshResource == null ? new ClassPathResource(refreshLocation) : refreshResource;
            resourceAsStream = getRefreshResource().getInputStream();
            Properties prop = new Properties();
            prop.load(resourceAsStream);
            boolean enabled = Boolean.parseBoolean(prop.getProperty("enabled", "false")); // 是否启用Mapper变更检测
            if (enabled) {
                delaySeconds = Long.parseLong(prop.getProperty("delaySeconds", "0"));
                sleepSeconds = Long.parseLong(prop.getProperty("sleepSeconds", "0"));
                delaySeconds = (delaySeconds < 60 ? 60 * 5 : delaySeconds) * 1000;
                sleepSeconds = (sleepSeconds < 5 ? 60 * 3 : sleepSeconds) * 1000;
                // 获取sqlSessionFactoryBean中的sqlSessionFactoryBean
                configuration = sqlSessionFactory.getConfiguration();
                // 用一个线程启动文件变更检测
                new Thread(this).start();
            }
        } catch (Exception e) {
            logger.warn("mybatis文件变更检测异常:{}", e.getLocalizedMessage());
        } finally {
            if (resourceAsStream != null) {
                try {resourceAsStream.close();} catch (IOException e) {}
            }
        }
    }

    /**
     * 初始化资源
     * @throws Exception
     */
    private void initResource() throws Exception {
        // 通过反射获取sqlSessionFactoryBean中的mapperLocations
        Field loadedResourcesField = configuration.getClass().getDeclaredField("loadedResources");
        loadedResourcesField.setAccessible(true);
        reflectLoadedResources = (Set<String>) loadedResourcesField.get(configuration);
        mapperResources = new HashSet<>(reflectLoadedResources.size() / 2);
        Iterator<String> iterator = reflectLoadedResources.iterator();
        Pattern pattern = Pattern.compile("^file \\[(.*)\\]$");
        while (iterator.hasNext()) {
            String loadedResource = iterator.next();
            Matcher matcher = pattern.matcher(loadedResource);
            if (!matcher.find()) { continue; }
            loadedResource = matcher.group(1);
            mapperResources.add(loadedResource);
            logger.debug("检测的映射文件:{}", loadedResource);
        }

        // 清理原有资源，更新为此类实现的StrictMap，提供增量重新加载
        String[] mapFieldNames = new String[]{
                "mappedStatements", "caches",
                "resultMaps", "parameterMaps",
                "keyGenerators", "sqlFragments"
        };
        for (String fieldName : mapFieldNames) {
            Field field = configuration.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            Map map = ((Map) field.get(configuration));
            if (!(map instanceof StrictMap)) {
                Map newMap = new StrictMap(fieldName + "collection", map.size());
                for (Object key : map.keySet()) {
                    try {
                        newMap.put(key, map.get(key));
                    } catch (IllegalArgumentException ex) {
                        newMap.put(key, ex.getMessage());
                    }
                }
                field.set(configuration, newMap);
            }
        }
    }

    /**
     * 执行刷新
     * @param resource 刷新的文件
     */
    private void refresh(String resource) throws Exception {
        InputStream inputStream = null;
        try {
            File refreshFile = new File(resource);
            if (refreshFile.lastModified() <= beforeTime) { return; }
            // 清理已加载的资源，否则不会重新加载。
            reflectLoadedResources.remove(resource);
            // 重新编译加载资源文件
            inputStream = new FileInputStream(refreshFile);
            XMLMapperBuilder xmlMapperBuilder = new XMLMapperBuilder(inputStream, configuration, resource, configuration.getSqlFragments());
            xmlMapperBuilder.parse();
            logger.debug("重新加载文件成功:{}", resource);
        } catch (Exception e) {
            throw new NestedIOException("文件解析异常: '" + resource + "'", e);
        } finally {
            if (inputStream != null) { inputStream.close(); }
        }
    }

    @Override
    public void run() {
        try {
            initResource();             // 初始化配置
            Thread.sleep(delaySeconds); // 系统初次启动,休眠一段时间
        } catch (Exception e) {
            logger.warn("", e);
        }
        logger.debug("mybatis mapper文件变更检测已开启");
        logger.debug("每次检测间隔时间:{}秒", sleepSeconds / 1000);
        logger.debug("文件总数:{}", mapperResources.size());
        beforeTime = System.currentTimeMillis();
        while (true) {
            try {
                Thread.sleep(sleepSeconds); // 每次扫描间隔时间
                logger.debug("执行mybatis mapper文件变更检测");
                for (String mapperResource : mapperResources) {
                    this.refresh(mapperResource);
                }
                // 修改刷新时间
                this.beforeTime = System.currentTimeMillis();
            } catch (Exception e) {
                logger.warn("检测异常", e);
            }
        }
    }

    /**
     * 重写 org.apache.ibatis.session.Configuration.StrictMap 类
     * 来自 MyBatis3.4.0版本，修改 put 方法，允许反复 put更新。
     */
    public static class StrictMap<V> extends HashMap<String, V> {
        private static final long serialVersionUID = -4950446264854982944L;
        private String name;

        public StrictMap(String name, int size) {
            super(size, 1.0F);
            this.name = name;
        }

        @SuppressWarnings("unchecked")
        public V put(String key, V value) {
            if (key.contains(".")) {
                final String shortKey = getShortName(key);
                if (super.get(shortKey) == null) {
                    super.put(shortKey, value);
                } else {
                    super.put(shortKey, (V) new Ambiguity(shortKey));
                }
            }
            return super.put(key, value);
        }

        public V get(Object key) {
            V value = super.get(key);
            if (value == null) {
                throw new IllegalArgumentException(name + " does not contain value for " + key);
            }
            if (value instanceof Ambiguity) {
                throw new IllegalArgumentException(((Ambiguity) value).getSubject() + " is ambiguous in " + name
                        + " (try using the full name including the namespace, or rename one of the entries)");
            }
            return value;
        }

        private String getShortName(String key) {
            final String[] keyparts = key.split("\\.");
            return keyparts[keyparts.length - 1];
        }

        protected static class Ambiguity {
            private String subject;

            public Ambiguity(String subject) {
                this.subject = subject;
            }

            public String getSubject() {
                return subject;
            }
        }
    }

    public Resource getRefreshResource() {
        return refreshResource;
    }

    public MybatisMapperRefresh setRefreshResource(Resource refreshResource) {
        this.refreshResource = refreshResource;
        return this;
    }

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public MybatisMapperRefresh setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
        return this;
    }
}