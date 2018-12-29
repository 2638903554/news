package com.leehom.news.service.impl;

import com.leehom.news.dao.BaseTest;
import com.leehom.news.po.Newsmaker;
import com.leehom.news.service.NewsmakerService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

public class NewsmakerServiceImplTest extends BaseTest{

    @Autowired
    private NewsmakerService newsmakerService;

    private static Integer NEWSMAKERID = 18;

    @Test
    public void insertNewsmakerTest(){
        Newsmaker newsmaker = new Newsmaker();
        newsmaker.setNewsmakerName("大司马");
        newsmaker.setNewsmakerAddress("中国");
        newsmaker.setNewsmakerAge(33);
        newsmaker.setNewsmakerJob("主播");
        newsmaker.setNewsmakerRemark("斗鱼王者荣耀主播，国服第一");
        newsmaker.setVoteQuantity(11);
        int result = newsmakerService.insertNewsmaker(newsmaker);
        Assert.assertTrue(1 == result);
    }

    @Test
    public void deleteNewsmakerByIdTest(){
        int result = newsmakerService.deleteNewsmakerById(NEWSMAKERID);
        Assert.assertTrue(1 == result);
    }

    @Test
    public void selectNewsmakerByIdTest(){
        Newsmaker newsmaker = newsmakerService.selectNewsmakerById(NEWSMAKERID);
        Assert.assertNotNull(newsmaker);
    }

    @Test
    public void selectAllTest() throws Exception {
        List<Newsmaker> newsmakerList = newsmakerService.selectAll();
        Assert.assertNotNull(newsmakerList);
        Assert.assertTrue(newsmakerList.size() > 0);
    }

    @Test
    public void updateNewsmakerTest(){
        Newsmaker newsmaker = newsmakerService.selectNewsmakerById(NEWSMAKERID);
        newsmaker.setNewsmakerName("小司马");
        int result = newsmakerService.updateNewsmaker(newsmaker);
        Assert.assertTrue(1 == result);
    }

}