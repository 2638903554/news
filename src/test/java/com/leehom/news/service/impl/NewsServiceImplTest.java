package com.leehom.news.service.impl;

import com.leehom.news.dao.BaseTest;
import com.leehom.news.po.News;
import com.leehom.news.service.NewsService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class NewsServiceImplTest extends BaseTest {

    @Autowired
    private NewsService newsService;

    @Test
    public void selectByNewsId() {

        News news = newsService.selectByNewsId(1);
        Assert.assertNotNull(news);

    }
}