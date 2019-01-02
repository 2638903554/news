package com.leehom.news.service;

import com.leehom.news.dao.NewsDao;
import com.leehom.news.dto.ArticleDto;
import com.leehom.news.dto.NewsDto;
import com.leehom.news.po.News;

import java.util.List;

public interface NewsService {


    News selectByNewsId(Integer newsId);

    List<NewsDto> selectAll();

    List<NewsDto> selectNewsByTypeIdAndKeyWord(Integer typeId,String newsTitle);

    ArticleDto selectArticleDtoByNewsId(Integer newsId);

    List<ArticleDto> selectNewsOfTheDay();

    List<ArticleDto> selectArticleDtoByViews();

    Integer newsCount();

    Integer countViews();

    int updateNews(News news);

}
