package com.leehom.news.dao;

import com.leehom.news.dto.ArticleDto;
import com.leehom.news.dto.NewsDto;
import com.leehom.news.po.News;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class NewsDaoTest extends BaseTest {

    @Autowired
    private NewsDao newsDao;

    private static Integer NEWSID = 1;

    @Test
    public void selectByNewsIdTest(){
        News news = newsDao.selectNewsById(NEWSID);
        Assert.assertNotNull(news);
    }

    @Test
    public void selectAllTest(){
        List<NewsDto> newsDtoList = newsDao.selectAll();
        Assert.assertNotNull(newsDtoList);
        Assert.assertTrue(newsDtoList.size() > 0);
    }

    @Test
    public void selectNewsByTypeIdAndKeyWord(){
        List<NewsDto> newsDtoList = newsDao.selectNewsByTypeIdAndKeyWord(15,"小");
        Assert.assertNotNull(newsDtoList);
        Assert.assertTrue(newsDtoList.size() > 0);
    }

    @Test
    public void selectNewsByTypeIdTest(){
        List<NewsDto> newsDtoList = newsDao.selectThreeNewsByTypeId(15);
        Assert.assertNotNull(newsDtoList);
        Assert.assertTrue(newsDtoList.size()>0);
    }

    @Test
    public void selectAllBySubnavIdTest(){
        List<News> newsList = newsDao.selectAllBySubnavId(38);
        Assert.assertNotNull(newsList);
    }

    @Test
    public void selectArticleDtoByViewsTest(){
        List<ArticleDto> articleDtoList = newsDao.selectArticleDtoByViews();
        Assert.assertNotNull(articleDtoList.size() > 0);
    }

    @Test
    public void newsCountTest(){
        Integer result = newsDao.newsCount();

    }

    @Test
    public void countViewsTest(){
        Integer result = newsDao.countViews();

    }

}