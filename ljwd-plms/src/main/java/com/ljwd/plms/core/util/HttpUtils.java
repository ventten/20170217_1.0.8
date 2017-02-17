package com.ljwd.plms.core.util;

import com.alibaba.druid.util.StringUtils;
import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.web.vo.ErrorInfo;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.activation.MimetypesFileTypeMap;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;

/**
 * Created by zhengzw on 2016/8/19
 * Http工具类
 */
public class HttpUtils {
    private static Logger logger = LoggerFactory.getLogger(HttpUtils.class);
    public static final int TIME_OUT = 1000 * 40;
    public static final String ENCODING = "UTF-8";
    public static final String METHOD = "POST";

    public static String MFBMS_HTTP_URL;                //微贷Http请求url
    public static String MFBMS_U;                       //登录微贷用户名
    public static String MFBMS_P;                       //登录微贷用户密码
    public static final String FROM_DEST = "plms";      //消息发送端系统简称
    //微贷错误信息
    private static Map<String,String> codeMap = new HashMap<String,String>();
    static {
        MFBMS_HTTP_URL = ConfigUtil.getStringVal("interface.config.mfbms.http.url");
        MFBMS_U = ConfigUtil.getStringVal("interface.config.mfbms.http.userId");
        MFBMS_P = ConfigUtil.getStringVal("interface.config.mfbms.http.pwd");
        codeMap.put("MFBMS_SYS_00001","微贷系统错误");
        codeMap.put("MFBMS_IM_10001","重复消息发送");
        codeMap.put("MFBMS_IM_10002","错误请求");
        codeMap.put("MFBMS_IM_10003","错误的用户名或密码");
    }

    /**
     * 发送Get请求
     * @param url 请求地址
     */
    public static String sendHttpGet(String url) {
        if (StringUtils.isEmpty(url)) {
            throw new RuntimeException("url is null");
        }
        logger.info("sendHttpGet url:" + url);
        BufferedReader in = null;
        String result = null;
        try {
            //定义HttpClient
            HttpClient client = new DefaultHttpClient();
            //实例化HTTP方法
            HttpGet httpGetRequest = new HttpGet();
            httpGetRequest.setURI(new URI(url));
            HttpResponse response = client.execute(httpGetRequest);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                StringBuffer sb = new StringBuffer("");
                String line = "";
                String NL = System.getProperty("line.separator");
                while ((line = in.readLine()) != null) {
                    sb.append(line + NL);
                }
                //关闭BufferedReader
                in.close();
                result = sb.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("发送Get请求失败:" + e.getMessage());
            throw new RuntimeException("发送Get请求失败:" + e.getMessage());
        } finally {
            if (in != null) {
                try {
                    //最后要关闭BufferedReader
                    in.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return result;
        }
    }

    /**
     * 发送Http请求到微贷
     * @param xmlObj JAXB序列号后的参数
     * @param reqStyle 请求类型:RPC、MSG
     * @param messageType 消息名,即请求的操作
     */
    public static JSONResult sendHttpToMfbms(String xmlObj,String reqStyle,String messageType) {
        HttpClient httpClient = new DefaultHttpClient();
        httpClient.getParams().setParameter(ClientPNames.ALLOW_CIRCULAR_REDIRECTS,true);
        //返回结果
        JSONResult jsonResult = new JSONResult();
        try {
            String url = "?reqStyle=" + reqStyle + "&messageType=" + messageType + "&messageId=" + UUID.randomUUID().toString() + "&fromDest=" + FROM_DEST + "&mesasgeFormat=" + "XML"+ "&u=" + MFBMS_U + "&p=" + URLEncoder.encode(MFBMS_P, "UTF-8");
            String postUrl = MFBMS_HTTP_URL + url;
            logger.info("向微贷发送请求 url：" + postUrl);
            HttpPost httpPost = new HttpPost(postUrl);
            logger.info("向微贷发送参数 param：" + xmlObj);
            httpPost.setEntity(new StringEntity(xmlObj, "UTF-8"));
            httpPost.setHeader("Content-Type", "application/json");
            HttpResponse response = httpClient.execute(httpPost);
            //http请求结果
            int status = response.getStatusLine().getStatusCode();
            logger.info("微贷返回状态码:" + status);
            if (status == 200) {
                //成功
                jsonResult.setSuccess(true);
                jsonResult.setMessage("请求执行成功");
                return jsonResult;
            }else if(status == 401){
                //失败
                jsonResult.setSuccess(false);
                jsonResult.setMessage("用户名或密码错误");
                return jsonResult;
            }else {
                //失败 接收资源
                InputStream is = response.getEntity().getContent();
                InputStreamReader reader = new InputStreamReader(is, "utf-8");
                BufferedReader bufferedReader = new BufferedReader(reader);
                StringBuffer buffer = new StringBuffer();
                String str = null;
                while ((str = bufferedReader.readLine()) != null) {
                    buffer.append(str);
                }
                JaxbBinder resultBinder = new JaxbBinder(ErrorInfo.class,JaxbBinder.CollectionWrapper.class);
                ErrorInfo errorInfo = resultBinder.fromXml(buffer.toString());
                jsonResult.setSuccess(false);
                if(errorInfo != null){
                    logger.info("errorCode:" + errorInfo.getErrorCode());
                    logger.info("errorMessage:" + errorInfo.getErrorMessage());
                    String msg = codeMap.get(errorInfo.getErrorCode());
                    if(msg == null){
                        msg = errorInfo.getErrorMessage();
                    }
                    jsonResult.setMessage(msg);
                }else {
                    logger.info("errorInfo is null");
                    jsonResult.setMessage("请求执行失败");
                }

                try {
                    //释放资源
                    bufferedReader.close();
                    reader.close();
                    is.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            logger.error("向微贷请求失败:" + e);
            e.printStackTrace();
            jsonResult.setSuccess(false);
            jsonResult.setMessage(e.getMessage());
        }
        return jsonResult;
    }

    /**
     * 获取request请求的IP地址
     * @param request request
     * @return IP地址
     */
    public static String getRequestIp(HttpServletRequest request) {
        String IP = request.getHeader("x-forwarded-for");
        if (IP == null || IP.length() == 0 || "unknown".equalsIgnoreCase(IP)) {
            IP = request.getHeader("Proxy-Client-IP");
        }
        if (IP == null || IP.length() == 0 || "unknown".equalsIgnoreCase(IP)) {
            IP = request.getHeader("WL-Proxy-Client-IP");
        }
        if (IP == null || IP.length() == 0 || "unknown".equalsIgnoreCase(IP)) {
            IP = request.getRemoteAddr();
        }
        return IP.equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : IP;
    }

    /**
     * 获取客户IP地址
     * @param request
     * @return 返回客户IP
     */
    public static String getRequestFullIp(HttpServletRequest request) {
        StringBuilder sb = new StringBuilder(64);
        sb.append(request.getRemoteAddr());
        sb.append("|").append(request.getHeader("x-forwarded-for"));
        sb.append("|").append(request.getHeader("Proxy-Client-IP"));
        sb.append("|").append(request.getHeader("WL-Proxy-Client-IP"));
        return sb.toString();
    }

    /**
     * 获取浏览器请求标识
     * @param request
     * @return 返回浏览器请求标识
     */
    public static String getUserAgent(HttpServletRequest request) {
        return request.getHeader("User-Agent");
    }

    /**
     * 以Get方式发送HTTP请求
     * @param url 请求完整地址
     * @return
     */
    public static String sendGet(String url) {
        return sendGet(url, TIME_OUT);
    }

    /**
     * 以Get方式发送HTTP请求
     * @param url     请求完整地址
     * @param timeout 超时时间.单位:毫秒
     * @return
     */
    public static String sendGet(String url, int timeout) {
        return send(url, null, false, timeout, null).getContext();
    }

    /**
     * 以POST方式发送HTTPS请求
     * @param url  请求地址
     * @param data 发送的数据
     * @return
     */
    public static String sendPost(String url, String data) {
        return sendPost(url, data, TIME_OUT);
    }

    /**
     * 以POST方式发送HTTPS请求
     * @param url     请求地址
     * @param data    发送的数据
     * @param timeout 超时时间.单位:毫秒
     * @return
     */
    public static String sendPost(String url, String data, int timeout) {
        return send(url, data, true, timeout, null).getContext();
    }

    /**
     * 以POST方式发送HTTPS请求
     * @param url       请求地址
     * @param data      发送的数据
     * @param sessionId 请求的sessionId.用于绑定用户身份信息
     * @return
     */
    public static HttpResult sendPost(String url, String data, String sessionId) {
        return send(url, data, true, TIME_OUT, sessionId);
    }

    /**
     * 发送HTTP请求
     * @param url       请求地址
     * @param data      发送内容
     * @param isPost    true:POST请求,false:GET请求
     * @param sessionId 请求的sessionId
     * @return
     */
    public static String send(String url, String data, boolean isPost, String sessionId) {
        HttpResult result = send(url, data, isPost, TIME_OUT, sessionId);
        return result.getContext();
    }

    /**
     * 发送HTTP请求
     * @param url       请求地址
     * @param data      发送内容
     * @param isPost    true:POST请求,false:GET请求
     * @param timeout   超时时间.单位:毫秒
     * @param sessionId 请求的sessionId.用于绑定用户身份信息
     * @return 返回HttpResult.
     */
    public static HttpResult send(String url, String data, boolean isPost, int timeout, String sessionId) {
        HttpResult httpResult = new HttpResult();
        HttpURLConnection connection = null;
        InputStream inputStream = null;
        try {
            connection = connect(url, data, isPost, timeout, sessionId);
            inputStream = connection.getInputStream();
            httpResult.setContext(IOUtils.toString(inputStream, ENCODING));
            sessionId = getSessionCookie(connection);
            httpResult.setSessionId(sessionId);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(), e);
        } finally {
            IOUtils.closeQuietly(inputStream);
            if (connection != null) { connection.disconnect(); }
        }
        return httpResult;
    }

    /**
     * 获取服务器响应的session对应的Cookie信息
     * @param connection HTTP连接对象
     * @return 返回SESSIONID的cookie值
     */
    protected static String getSessionCookie(HttpURLConnection connection) {
        StringBuilder sessionId = new StringBuilder(200);
        Map<String, List<String>> headerFields = connection.getHeaderFields();
        if (headerFields == null || headerFields.isEmpty()) { return sessionId.toString(); }
        List<String> cookies = headerFields.get("Set-Cookie");
        if (cookies == null || cookies.isEmpty()) { return sessionId.toString(); }
        for (String cookie : cookies) {
            sessionId.append(", ").append(cookie);
        }
        sessionId.delete(0, 2);
        String key = "JSESSIONID=";
        int index = sessionId.indexOf(key);
        return index == -1 ? "" : sessionId.substring(index, index + key.length() + 32);
    }

    /**
     * 发起连接
     * @param url       请求地址
     * @param data      发送内容
     * @param isPost    true:POST请求,false:GET请求
     * @param timeout   超时时间.单位:毫秒
     * @param sessionId 请求的sessionId.用于绑定用户身份信息
     * @return
     */
    public static HttpURLConnection connect(String url, String data, boolean isPost, int timeout, String sessionId) {
        HttpURLConnection connection = null;
        try {
            // GET请求,并且请求数据不为空
            if (!isPost && data != null && !data.isEmpty()) {
                if (data.startsWith("?")) {
                    data = data.substring(1, data.length());
                }
                url += (url.indexOf("?") == -1 ? "?" : "&") + data;
            }
            connection = (HttpURLConnection) new URL(url).openConnection();
            if (isPost) connection.setRequestMethod(METHOD);
            connection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
//            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            connection.setConnectTimeout(timeout);
            connection.setReadTimeout(timeout);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            if (sessionId != null) { connection.setRequestProperty("Cookie", sessionId); }
            if (isPost && data != null && !data.isEmpty()) {
                byte[] bytes = data.getBytes(ENCODING);
                connection.setDoOutput(true);
                connection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
                OutputStream os = null;
                try {
                    os = connection.getOutputStream();
                    os.write(bytes);
                    os.flush();
                    os.close();
                } catch (Exception e) {
                } finally {
                    IOUtils.closeQuietly(os);
                }
            }
            return connection;
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

    /**
     * 上传附件连接
     * <h3>提交数据格式如下:</h3>
     * <pre>
     * --1476848718690
     * Content-Disposition: form-data; name="参数名称"
     *
     * 参数值
     * --1476848718690
     * Content-Disposition: form-data; name="文件参数名称(file)"; filename="文件名称(point.json)"
     * Content-Type:application/octet-stream
     *
     * [(文件内容)
     * {"lng":114.075,"lat":22.547,"accuracy":5.00,"date":"2016-10-10 12:13:22"},
     * {"lng":114.075,"lat":22.548,"accuracy":5.00,"date":"2016-10-10 12:25:22"}
     * ]
     * --1476848718690--
     * </pre>
     * @param url       请求地址
     * @param fileMap   上传的文件列表
     * @param data      上传的额外数据.格式:Map<参数名称,参数值>
     * @param sessionId 请求的sessionId.用于绑定用户身份信息
     * @return
     */
    public static HttpURLConnection formUploadConnection(String url, Map<String, File> fileMap, Map<String, String> data, String sessionId) {
        String BOUNDARY = String.valueOf(System.currentTimeMillis()); // BOUNDARY就是request头和上传文件内容的分隔符
        String LINE = "--";                                           // 分隔符标识位
        String BR = "\r\n";                                           // 换行符
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(TIME_OUT);
            conn.setReadTimeout(TIME_OUT);
            conn.setUseCaches(false);
            conn.setDoInput(true);
            conn.setRequestMethod(METHOD);
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; zh-CN; rv:1.9.2.6)");
            conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);
            if (sessionId != null) { conn.setRequestProperty("Cookie", sessionId); }

            conn.setDoOutput(true);
            OutputStream out = conn.getOutputStream();
            /**
             // 添加上传参数begin:
             // --xxxxxxxxxxxxxx(换行符)
             // Content-Disposition: form-data; name="参数名"(换行符)
             // (换行符)参数值(换行符)
             // 添加上传参数end.
             * 例如:
             * --1476848718690
             * Content-Disposition: form-data; name="参数名称"
             *
             * 参数值
             */
            if (data != null && !data.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                Iterator<Map.Entry<String, String>> iterator = data.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, String> entry = iterator.next();
                    String entryKey = entry.getKey();
                    String entryValue = entry.getValue();
                    if (entryKey == null) { continue; }
                    stringBuilder.append(LINE).append(BOUNDARY).append(BR);
                    stringBuilder.append("Content-Disposition: form-data; name=\"").append(entryKey).append("\"").append(BR);
                    stringBuilder.append(BR).append(entryValue).append(BR);
                }
                out.write(stringBuilder.toString().getBytes(ENCODING));
                out.flush();
            }

            /**
             // 添加上传文件内容begin:
             // --xxxxxxxxxxxxxx(换行符)
             // Content-Disposition: form-data; name="参数名"; filename="文件名"(换行符)
             // (换行符)文件内容(换行符)
             // 添加上传文件内容end.
             * 例如:
             * --1476848718690
             * Content-Disposition: form-data; name="文件参数名称(file)"; filename="文件名称(point.json)"
             * Content-Type:application/octet-stream
             *
             * [(文件内容)
             * {"lng":114.075,"lat":22.547,"accuracy":5.00,"date":"2016-10-10 12:13:22"},
             * {"lng":114.075,"lat":22.548,"accuracy":5.00,"date":"2016-10-10 12:25:22"}
             * ]
             */
            if (fileMap != null && !fileMap.isEmpty()) {
                Iterator<Map.Entry<String, File>> iterator = fileMap.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, File> entry = iterator.next();
                    String entryKey = entry.getKey();
                    File file = entry.getValue();
                    if (entryKey == null || file == null) { continue; }
                    String filename = file.getName();
                    String contentType = new MimetypesFileTypeMap().getContentType(file);
                    if (contentType == null || contentType.isEmpty()) {
                        contentType = "application/octet-stream";
                    } else if (filename.endsWith(".png")) {
                        contentType = "image/png";
                    }
                    StringBuilder fileStringBuilder = new StringBuilder(400);
                    fileStringBuilder.append(LINE).append(BOUNDARY).append(BR);
                    fileStringBuilder.append("Content-Disposition: form-data; name=\"").append(entryKey).append("\"; filename=\"").append(filename).append("\"").append(BR);
                    fileStringBuilder.append("Content-Type:").append(contentType).append(BR);
                    fileStringBuilder.append(BR);
                    out.write(fileStringBuilder.toString().getBytes(ENCODING)); // 将文件内容前的内容写入流
                    fileStringBuilder = null;
                    InputStream in = null;
                    try { // 文件内容
                        in = new FileInputStream(file);
                        IOUtils.copyLarge(in, out);
                        out.write(BR.getBytes(ENCODING)); // 追加的换行符
                        out.flush();
                    } finally {
                        IOUtils.closeQuietly(in);
                    }
                }
            }
            // 结尾符
            // --xxxxxxxxxxxxxx--
            byte[] endData = (LINE + BOUNDARY + LINE).getBytes(ENCODING);
            out.write(endData);
            out.flush();
            IOUtils.closeQuietly(out);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
        }
        return conn;
    }

    /**
     * 以POST方式上传文件
     * @param url       请求地址
     * @param fileMap   上传的文件
     * @param data      跟随文件上传的附带内容
     * @param sessionId 请求的sessionId.用于绑定用户身份信息,为空不绑定
     * @return 返回HttpResult.
     */
    public static HttpResult formUpload(String url, Map<String, File> fileMap, Map<String, String> data, String sessionId) {
        HttpResult httpResult = new HttpResult();
        HttpURLConnection connection = null;
        InputStream inputStream = null;
        try {
            connection = formUploadConnection(url, fileMap, data, sessionId);
            inputStream = connection.getInputStream();
            httpResult.setContext(IOUtils.toString(inputStream, ENCODING));
            httpResult.setSessionId(getSessionCookie(connection));
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(), e);
        } finally {
            IOUtils.closeQuietly(inputStream);
            if (connection != null) { connection.disconnect(); }
        }
        return httpResult;
    }

    /**
     * 构造表单提交数据
     * @param parameters 提交参数封装
     * @param len        预估数据长度.(为了减少数组扩容拷贝开销,请指定合适的数据长度,尽量接近返回值长度)
     * @return 返回参数构造后的结果
     */
    public static String formatFormParameters(Map<String, String> parameters, int len) {
        StringBuilder sb = new StringBuilder(len <= 256 ? 256 : len);
        Iterator<Map.Entry<String, String>> entryIterator = parameters.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            sb.append("&").append(entry.getKey()).append("=").append(entry.getValue());
        }
        return sb.toString();
    }

    /**
     * HTTP请求结果
     */
    public static class HttpResult {
        /**
         * 返回的SessionId.格式:JSESSIONID=SessionId
         * 当且仅当要求返回时才会有该值存在
         */
        private String sessionId;
        /** 请求的返回值 */
        private String context;

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
        }
    }

    /**
     * 根据request获取上传的Excel文件
     * @param request request
     * @return JSONResult 若成功则返回一个MultipartFile放在JSONResult data中
     */
    public static JSONResult getExcelMultipartFile(HttpServletRequest request) {
        //创建一个通用的文件解析器
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        //判断request是否有文件上传,即多文件请求
        if (multipartResolver.isMultipart(request)) {
            try {
                MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;              //转换request
                if (multiRequest.getMultiFileMap().size() == 0) {
                    return new JSONResult(false, "请选择一个Excel文件");
                }
                if (multiRequest.getMultiFileMap().size() > 1) {
                    return new JSONResult(false, "一次只能上传一个文件");
                }
                Iterator<String> iterator = multiRequest.getFileNames();                                      //取得request中的所有文件名
                while (iterator.hasNext()) {
                    MultipartFile multipartFile = multiRequest.getFile(iterator.next());                      //取得上传文件
                    if (multipartFile == null || StringUtil.isEmpty(multipartFile.getOriginalFilename())) {
                        return new JSONResult(false, "文件不存在");
                    }
                    String fileName = multipartFile.getOriginalFilename();                                    //取得当前上传文件的文件名称
                    //如果名称不为"",说明该文件存在,否则说明该文件不存在
                    try {
                        String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
                        if (!".XLS".equalsIgnoreCase(ext.toUpperCase()) && !".XLSX".equalsIgnoreCase(ext.toUpperCase())) {
                            return new JSONResult(false, "请选择Excel文件");
                        }
                    } catch (Exception e) {
                        return new JSONResult(false, "请选择Excel文件");
                    }
                    return new JSONResult(new FileResult(fileName, multipartFile), "成功", true);
                }
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(e.getMessage());
                return new JSONResult(false, e.getMessage());
            }

            return new JSONResult(false, "未找到上传文件");

        } else {
            return new JSONResult(false, "请选择一个Excel文件");
        }
    }

    /**
     * 根据request获取上传的文件结果
     */
    public static class FileResult {
        private String fileName;                //文件名
        private MultipartFile multipartFile;    //MultipartFile文件

        public FileResult() {

        }

        public FileResult(String fileName, MultipartFile multipartFile) {
            this.fileName = fileName;
            this.multipartFile = multipartFile;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public MultipartFile getMultipartFile() {
            return multipartFile;
        }

        public void setMultipartFile(MultipartFile multipartFile) {
            this.multipartFile = multipartFile;
        }
    }

}
