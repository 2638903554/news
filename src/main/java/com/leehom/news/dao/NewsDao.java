package com.leehom.news.dao;

import com.leehom.news.dto.NewsDto;
import com.leehom.news.po.News;

import java.util.List;


public interface NewsDao {

    News selectByNewsId(Integer newsId);

    List<News> selectAll();

}
