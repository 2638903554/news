package com.leehom.news.dao;

import com.leehom.news.po.Newsmaker;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class NewsmakerDaoTest extends BaseTest {

    @Autowired
    private NewsmakerDao newsmakerDao;

    public static Integer NEWSMAKERID = 19;
    @Test
    public void insertNewsmakerTest(){
        Newsmaker newsmaker = new Newsmaker();
        newsmaker.setNewsmakerName("小明");
        newsmaker.setNewsmakerAddress("深圳");
        newsmaker.setNewsmakerAge(22);
        newsmaker.setNewsmakerJob("游戏主播");
        newsmaker.setVoteQuantity(11);
        newsmaker.setNewsmakerRemark("斗鱼王者荣耀主播，国服第一");
        int result = newsmakerDao.insertNewsmaker(newsmaker);
        Assert.assertTrue(1 == result);
    }

    @Test
    public void deleteNewsmakerByIdTest(){
        int result = newsmakerDao.deleteNewsmakerById(NEWSMAKERID);
        Assert.assertTrue(1 == result);
    }

    @Test
    public void selectNewsmakerByIdTest(){
        Newsmaker newsmaker = newsmakerDao.selectNewsmakerById(NEWSMAKERID);
        Assert.assertNotNull(newsmaker);
    }

    @Test
    public void selectAllTest(){

        List<Newsmaker> newsmakerList = newsmakerDao.selectAll();
        Assert.assertNotNull(newsmakerList);
        Assert.assertTrue(newsmakerList.size() > 0);

    }

    @Test
    public void updateNewsmakerTest(){
        Newsmaker newsmaker = newsmakerDao.selectNewsmakerById(NEWSMAKERID);
        newsmaker.setNewsmakerName("大司马");
        int result = newsmakerDao.updateNewsmaker(newsmaker);
        Assert.assertTrue(1 == result);
    }

}