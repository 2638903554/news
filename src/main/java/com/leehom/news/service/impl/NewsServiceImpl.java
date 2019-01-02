package com.leehom.news.service.impl;

import com.leehom.news.dao.NewsDao;
import com.leehom.news.dto.ArticleDto;
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
    public int updateNews(News news) {
        return newsDao.updateNews(news);
    }

    @Override
    public News selectByNewsId(Integer newsId) {
        return newsDao.selectNewsById(newsId);
    }

    @Override
    public List<NewsDto> selectAll() {
        return newsDao.selectAll();
    }

    @Override
    public List<ArticleDto> selectArticleDtoByViews() {
        return newsDao.selectArticleDtoByViews();
    }

    @Override
    public List<ArticleDto> selectNewsOfTheDay() {
        return newsDao.selectNewsOfTheDay();
    }

    @Override
    public List<NewsDto> selectNewsByTypeIdAndKeyWord(Integer typeId, String newsTitle) {
        return newsDao.selectNewsByTypeIdAndKeyWord(typeId,newsTitle);
    }

    @Override
    public Integer countViews() {
        return newsDao.countViews();
    }

    @Override
    public ArticleDto selectArticleDtoByNewsId(Integer newsId) {
        return newsDao.selectArticleDtoByNewsId(newsId);
    }

    @Override
    public Integer newsCount() {
        return newsDao.newsCount();
    }

}
