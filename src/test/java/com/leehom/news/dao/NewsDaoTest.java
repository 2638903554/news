package com.leehom.news.dao;

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
        News news = newsDao.selectByNewsId(NEWSID);
        Assert.assertNotNull(news);
    }

    @Test
    public void selectAllTest(){
        List<News> newsList = newsDao.selectAll();
        Assert.assertNotNull(newsList);
        Assert.assertTrue(newsList.size() > 0);
    }

}