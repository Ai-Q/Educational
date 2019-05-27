package com.Educational.service;

import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @authorshkstart
 * @create2019-05-2518:38
 */
public interface BaseService<T> {


    /**
     * 查询一个数据
     * @param t
     * @return
     */
    public T queryOne(T t);
    /**
     * 查询集合
     * @param t
     * @return
     */
    public List<T> queryList(T t);
    /**
     * 查询所有集合
     * @param
     * @return
     */
    public List<T> queryAllList();

    /**
     * 查询数量
     * @param t
     * @return
     */
    public int queryCount(T t);
    /**
     * 根据主键id查询数据
     * @param id
     * @return
     */
    public T queryByPrimaryKey(Object id);
    /**
     * 判断主键是否存在
     * @param id
     * @return
     */
    public boolean existsWithPrimaryKey(Object id);




    /**
     * 新增数据
     * @param t
     * @return 受影响数据行数
     */
    public Integer save(T t);

    /**
     * 新增数据 不为null的数据作为参数插入
     * @param t
     * @return 受影响数据行数
     */
    public  Integer saveSelective(T t);




    /**
     * 更新数据
     * @param t
     * @return 受影响数据行数
     */
    public  Integer update(T t);
    /**
     * 新增数据 不为null的数据作为参数插入
     * @param t
     * @return
     */
    public  Integer updateSelective(T t);



    /**
     * 删除数据
     * @param t
     * @return
     */
    public Integer delete(T t);
    /**
     * 根据主键id删除
     * @param id
     * @return
     */
    public  Integer deleteById(Object id);
    /**
     * qbc查询
     */
    public List<T> queryEmpListByExamle(Example example);



}
