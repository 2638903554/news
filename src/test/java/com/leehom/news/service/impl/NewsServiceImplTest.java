package com.leehom.news.service.impl;

import com.leehom.news.dao.BaseTest;
import com.leehom.news.dto.NewsDto;
import com.leehom.news.po.News;
import com.leehom.news.service.NewsService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class NewsServiceImplTest extends BaseTest {

    @Autowired
    private NewsService newsService;

    @Test
    public void selectByNewsId() {
        News news = newsService.selectByNewsId(1);
        Assert.assertNotNull(news);
    }

    @Test
    public void selectAllTest(){
        List<NewsDto> newsDtoList = newsService.selectAll();
        Assert.assertNotNull(newsDtoList);
        Assert.assertTrue(newsDtoList.size()>0);
    }

    @Test
    public void selectAllByNewsIdTest(){
        List<NewsDto> newsDtoList = newsService.selectNewsByTypeIdAndKeyWord(15,"小");
        Assert.assertNotNull(newsDtoList);
        Assert.assertTrue(newsDtoList.size() > 0);
    }


}