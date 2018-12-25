package com.leehom.news.dao;

import com.leehom.news.po.News;

import java.util.List;

public interface NewsDao {

    List<News> selectNewsByDetailId(Integer detailId);

    /**
     * 首页体育/娱乐/财经相关内容的显示
     * @param typeId
     * @return
     */
    List<News> selectNewsByTypeId(Integer typeId);
}
