package com.ljwd.plms.core.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * GenericService的实现类, 其他的自定义 ServiceImpl, 继承自它,可以获得常用的增删查改操作,
 * 未实现的方法有 子类各自实现
 * <p/>
 * Model : 代表数据库中的表 映射的Java对象类型
 * PK :代表对象的主键类型
 */
public abstract class GenericServiceImpl<Model, PK> implements GenericService<Model, PK> {

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    public abstract GenericDao<Model, PK> getDao();

    /**
     * 插入对象
     * @param model 对象
     */
    public int insert(Model model) {
        return getDao().insertSelective(model);
    }

    /**
     * 根据ID和版本号更新对象
     * @param model 对象
     */
    public int update(Model model) {
        return getDao().updateByPrimaryKeySelective(model);
    }

    /**
     * 通过主键, 删除对象
     * @param id 主键
     */
    public int delete(PK id) {
        return getDao().deleteByPrimaryKey(id);
    }

    /**
     * 通过主键, 查询对象
     * @param id 主键
     * @return 对象
     */
    public Model selectById(PK id) {
        return getDao().selectByPrimaryKey(id);
    }

    @Override
    public Model selectOne() {
        return null;
    }

    @Override
    public List<Model> selectList() {
        return null;
    }

    /**
     * 批量添加(需自己在mapper写sql)
     * @param list 添加的数据集合
     */
    @Override
    public void insertBatch(List<Model> list) {
        if(list == null || list.size() <= 0){
            return;
        }
        int comm = 2000;
        int size = list.size()-1;
        if(size >= comm){
            List<Model> newList = new ArrayList<Model>();
            for(int i=0; i <= size; i++){
                if(i!=0 && i%comm == 0 || i == size){
                    newList.add(list.get(i));
                    getDao().insertBatch(newList);
                    newList.clear();
                }else{
                    newList.add(list.get(i));
                }
            }
        }else{
            getDao().insertBatch(list);
        }
    }

    /**
     * 批量修改(需自己在mapper写sql)
     * @param list 添加的数据集合
     */
    @Override
    public void updateBatch(List<Model> list) {
        if(list == null || list.size() <= 0){
            return;
        }
        int comm = 2000;
        int size = list.size()-1;
        if(size >= comm){
            List<Model> newList = new ArrayList<Model>();
            for(int i=0; i <= size; i++){
                if(i!=0 && i%comm == 0 || i == size){
                    newList.add(list.get(i));
                    getDao().updateBatch(newList);
                    newList.clear();
                }else{
                    newList.add(list.get(i));
                }
            }
        }else{
            getDao().updateBatch(list);
        }
    }

}
