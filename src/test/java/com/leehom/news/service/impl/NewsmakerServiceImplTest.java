package com.leehom.news.service.impl;

import com.leehom.news.dao.BaseTest;
import com.leehom.news.po.Newsmaker;
import com.leehom.news.service.NewsmakerService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NewsmakerServiceImplTest extends BaseTest{

    @Autowired
    private NewsmakerService newsmakerService;

    @Test
    public void selectAllTest() throws Exception {
        List<Newsmaker> newsmakerList = newsmakerService.selectAll();
        Assert.assertNotNull(newsmakerList);
        Assert.assertTrue(newsmakerList.size() > 0);
    }

}