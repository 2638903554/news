package com.leehom.news.dao;

import com.leehom.news.po.Nav;

import java.util.List;

public interface NavDao {

    /**
     * 添加一级导航
     * @param nav
     * @return
     */
    int insertNav(Nav nav);

    /**
     * 根据id删除一级导航
     * @param navId
     * @return
     */
    int deleteNavById(Integer navId);

    /**
     * 查找一级导航
     * @return
     */
    List<Nav> selectAll();

    /**
     * 根据id查询一级导航
     * @param navId
     * @return
     */
    Nav selectNavById(Integer navId);

    /**
     * 更新一级类别
     * @param nav
     * @return
     */
    int updateNav(Nav nav);

}
