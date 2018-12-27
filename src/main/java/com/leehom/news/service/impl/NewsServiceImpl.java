package com.leehom.news.service.impl;

import com.leehom.news.dao.NewsDao;
import com.leehom.news.dto.NewsDto;
import com.leehom.news.po.News;
import com.leehom.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;

    @Override
    public News selectByNewsId(Integer newsId) {
        return newsDao.selectByNewsId(newsId);
    }

    @Override
    public List<NewsDto> selectAll() {
        return newsDao.selectAll();
    }

    @Override
    public List<NewsDto> selectNewsByTypeIdAndKeyWord(Integer typeId, String newsTitle) {
        return newsDao.selectNewsByTypeIdAndKeyWord(typeId,newsTitle);
    }

    @Override
    public List<NewsDto> selectAllByNewsId(Integer newsId) {
        return newsDao.selectAllByNewsId(newsId);
    }

    @Override
    public List<NewsDto> selectThreeNewsByTypeId(Integer typeId) {
        return newsDao.selectThreeNewsByTypeId(typeId);
    }

    @Override
    public List<NewsDto> selectNewsByTypeId(Integer typeId) {
        return newsDao.selectNewsByTypeId(typeId);
    }
}
