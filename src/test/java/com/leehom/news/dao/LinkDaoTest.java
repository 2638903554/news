package com.leehom.news.dao;

import com.leehom.news.po.Link;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LinkDaoTest extends BaseTest {

    @Autowired
    private LinkDao linkDao;

    @Test
    public void selectAllTest(){
        List<Link> linkList = linkDao.selectAll();
        Assert.assertNotNull(linkList);
        Assert.assertTrue(linkList.size()>0);
    }

}