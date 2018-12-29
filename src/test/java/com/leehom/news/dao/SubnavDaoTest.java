//package com.leehom.news.dao;
//
//import com.leehom.news.po.Subnav;
//import org.junit.Assert;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//public class SubnavDaoTest extends BaseTest {
//
//    @Autowired
//    private SubnavDao subnavDao;
//
//    @Test
//    public void selectByDetailIdTest(){
//        Subnav subnav = subnavDao.selectByDetailId(15);
//        Assert.assertNotNull(subnav);
//    }
//
//    @Test
//    public void selectDetailListByTypeIdTest(){
//        List<Subnav> subnavList = subnavDao.selectDetailListByNavId(15);
//        Assert.assertNotNull(subnavList);
//        Assert.assertTrue(subnavList.size() > 0);
//    }
//
//}