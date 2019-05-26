package com.Educational.service;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @authorshkstart
 * @create2019-05-2518:38
 */
public class BaseService<T> {

    @Autowired
    private Mapper<T> mapper;

    public Mapper<T> getMapper(){
        return this.mapper;
    }

    /**
     * 查询一个数据
     * @param t
     * @return
     */
    public T queryOne(T t){
        return this.getMapper().selectOne(t);
    }
    /**
     * 查询集合
     * @param t
     * @return
     */
    public List<T> queryList(T t){return this.getMapper().select(t);}
    /**
     * 查询所有集合
     * @param
     * @return
     */
    public List<T> queryAllList(){return this.getMapper().selectAll();}

    /**
     * 查询数量
     * @param t
     * @return
     */
    public int queryCount(T t){return this.getMapper().selectCount(t);}
    /**
     * 根据主键id查询数据
     * @param id
     * @return
     */
    public T queryByPrimaryKey(Object id){return this.getMapper().selectByPrimaryKey(id);}
    /**
     * 判断主键是否存在
     * @param id
     * @return
     */
    public boolean existsWithPrimaryKey(Object id){return this.getMapper().existsWithPrimaryKey(id);}




    /**
     * 新增数据
     * @param t
     * @return 受影响数据行数
     */
    public Integer save(T t){return this.getMapper().insert(t);}

    /**
     * 新增数据 不为null的数据作为参数插入
     * @param t
     * @return 受影响数据行数
     */
    public  Integer saveSelective(T t){return this.getMapper().insertSelective(t);}




    /**
     * 更新数据
     * @param t
     * @return 受影响数据行数
     */
    public  Integer update(T t){return this.getMapper().updateByPrimaryKey(t);}
    /**
     * 新增数据 不为null的数据作为参数插入
     * @param t
     * @return
     */
    public  Integer updateSelective(T t){return this.getMapper().updateByPrimaryKeySelective(t);}



    /**
     * 删除数据
     * @param t
     * @return
     */
    public Integer delete(T t){return this.getMapper().delete(t);}
    /**
     * 根据主键id删除
     * @param id
     * @return
     */
    public  Integer deleteById(Object id){return this.getMapper().deleteByPrimaryKey(id);}



}
