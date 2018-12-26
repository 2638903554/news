package com.leehom.news.service.impl;

import com.leehom.news.dao.NewsDao;
import com.leehom.news.dto.NewsDto;
import com.leehom.news.po.News;
import com.leehom.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;

    @Override
    public News selectByNewsId(Integer newsId) {
        return newsDao.selectByNewsId(newsId);
    }

    @Override
    public NewsDto selectAll() {

        return null;
    }
}
