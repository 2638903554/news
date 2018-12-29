package com.leehom.news.dao;

import com.leehom.news.po.Subnav;

import java.util.List;

public interface SubnavDao {

    /**
     * 根据navId查询Subnav
     * @param navId
     * @return
     */
    List<Subnav> selectSubnavListByNavId(Integer navId);

    /**
     * 根据subnavId查询Subnav
     * @param subnavId
     * @return
     */
    Subnav selectBySubnavId(Integer subnavId);



}
