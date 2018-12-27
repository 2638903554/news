package com.leehom.news.service;

import com.leehom.news.dao.NewsDao;
import com.leehom.news.dto.NewsDto;
import com.leehom.news.po.News;

import java.util.List;

public interface NewsService {


    News selectByNewsId(Integer newsId);

    List<NewsDto> selectAll();

    List<NewsDto> selectAllByNewsId(Integer newsId);

    List<NewsDto> selectNewsByTypeIdAndKeyWord(Integer typeId,String newsTitle);

    List<NewsDto> selectThreeNewsByTypeId(Integer typeId);

    List<NewsDto> selectNewsByTypeId(Integer typeId);

}
