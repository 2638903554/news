package com.leehom.news.service;

import com.leehom.news.dao.NewsDao;
import com.leehom.news.dto.NewsDto;
import com.leehom.news.po.News;

public interface NewsService {


    News selectByNewsId(Integer newsId);

    NewsDto selectAll();

}
