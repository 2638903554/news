package com.leehom.news.dao;

import com.leehom.news.po.Subnav;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubnavDaoTest extends BaseTest {

    @Autowired
    private SubnavDao subnavDao;


    @Test
    public void insertSubnavTest(){
        Subnav subnav = new Subnav();
        subnav.setNavId(15);
        subnav.setSubnavName("网球");
        int result = subnavDao.insertSubnav(subnav);
        Assert.assertTrue(1 == result );
    }

    @Test
    public void deleteSubnavByIdTest(){
        int result = subnavDao.deleteSubnavById(56);
        Assert.assertTrue(1 == result);
    }

    @Test
    public void selectByDetailIdTest(){
        Subnav subnav = subnavDao.selectBySubnavId(38);
        Assert.assertNotNull(subnav);
    }

    @Test
    public void selectAllTest(){
        List<Subnav> subnavList = subnavDao.selectAll();
        Assert.assertNotNull(subnavList);
    }

    @Test
    public void selectDetailListByTypeIdTest(){
        List<Subnav> subnavList = subnavDao.selectSubnavListByNavId(15);
        Assert.assertNotNull(subnavList);
        Assert.assertTrue(subnavList.size() > 0);
    }

    @Test
    public void updateSubnavTest(){
        Subnav subnav = subnavDao.selectBySubnavId(55);
        subnav.setSubnavName("xx");
        int result = subnavDao.updateSubnav(subnav);
        Assert.assertTrue(1 == result);
    }



}