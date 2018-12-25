package com.leehom.news.dao;

import com.leehom.news.po.News;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NewsDaoTest extends BaseDaoTest {
    @Test
    public void selectNewsByDetailIdTest() throws Exception {
        SqlSession sqlSession = getSqlSession();
        try {
            NewsDao newsDao = sqlSession.getMapper(NewsDao.class);
            List<News> newsList = newsDao.selectNewsByDetailId(38);
            Assert.assertNotNull(newsList);
            Assert.assertTrue(newsList.size()>0);
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void selectNewsByTypeIdTest(){
        SqlSession sqlSession = getSqlSession();
        try {
            NewsDao newsDao = sqlSession.getMapper(NewsDao.class);
            List<News> newsList = newsDao.selectNewsByTypeId(42);
            Assert.assertNotNull(newsList);
            Assert.assertTrue(newsList.size()>0);
        }finally {
            sqlSession.close();
        }
    }

}