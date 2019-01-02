package com.leehom.news.service.impl;

import com.leehom.news.dao.NewsDao;
import com.leehom.news.dao.WordsDao;
import com.leehom.news.dto.WordsDto;
import com.leehom.news.po.News;
import com.leehom.news.po.Words;
import com.leehom.news.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordsServiceImpl implements WordsService {

    @Autowired
    private WordsDao wordsDao;

    @Autowired
    private NewsDao newsDao;

    @Override
    public void insertWords(Words words) {
        wordsDao.insertWords(words);
        Integer newsId = words.getNewsId();
        News news = newsDao.selectNewsById(newsId);
        news.setNewsWords(news.getNewsWords()+1);
        newsDao.updateNews(news);
    }

    @Override
    public List<WordsDto> selectAll(Integer newsId) {
        return wordsDao.selectAll(newsId);
    }
}
