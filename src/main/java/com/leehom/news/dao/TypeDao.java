package com.leehom.news.dao;

import com.leehom.news.po.Type;

import java.util.List;

public interface TypeDao {
    /**
     * 查找所有一级类别
     * @return
     */
    List<Type> selectAll();

    /**
     * 根据id查询一级类别
     * @param typeId
     * @return
     */
    Type selectTypeById(Integer typeId);

    /**
     * 更新一级类别
     * @param type
     * @return
     */
    int updateTypeById(Type type);

    /**
     * 根据id删除一级类别
     * @param typeId
     * @return
     */
    int deleteTypeById(Integer typeId);

    /**
     * 添加一级类别
     * @param type
     * @return
     */
    int insertTypeById(Type type);

}
