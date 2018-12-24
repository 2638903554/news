package com.leehom.news.dao;

import com.leehom.news.po.Link;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LinkDaoTest extends BaseDaoTest{

    @Test
    public void selectLinkByIdTest(){
        SqlSession sqlSession = getSqlSession();
        try {
            LinkDao linkDao = sqlSession.getMapper(LinkDao.class);
            Link link = linkDao.selectLinkById(1);
            Assert.assertNotNull(link);
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void selectAllTest(){
        SqlSession sqlSession = getSqlSession();
        try {
            LinkDao linkDao = sqlSession.getMapper(LinkDao.class);
            List<Link> linkList = linkDao.selectAll();
            Assert.assertNotNull(linkList);
            assertTrue(linkList.size()>0);
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void selectByLinkTest(){
        SqlSession sqlSession = getSqlSession();
        try {
            LinkDao linkDao = sqlSession.getMapper(LinkDao.class);
            Link link = new Link();
            link.setLinkId(1);
            link.setLinkName("新浪");
            Link result = linkDao.selectByLink(link);
            String address = "www.sina.com";
            Assert.assertEquals(address,result.getLinkUrl());
        }finally {
            sqlSession.close();
        }
    }

}