package com.leehom.news.dao;

import com.leehom.news.po.Nav;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NavDaoTest extends BaseTest {

    @Autowired
    private NavDao navDao;

    @Test
    public void insertNavTest(){
        Nav nav = new Nav();
        nav.setNavName("编程");
        int result = navDao.insertNav(nav);
        Assert.assertTrue(1==result);
    }

    @Test
    public void selectAll() throws Exception {
        List<Nav> navList = navDao.selectAll();
        Assert.assertNotNull(navList);
        Assert.assertTrue(navList.size()>0);
    }

    @Test
    public void selectNavByIdTest(){
        Nav type = navDao.selectNavById(15);
        Assert.assertNotNull(type);
    }

    @Test
    public void updateNavTest(){
        Nav type = navDao.selectNavById(44);
        type.setNavName("音乐");
        int result = navDao.updateNav(type);
        Assert.assertTrue(1==result);
    }

    @Test
    public void deleteNavByIdTest(){
        int result = navDao.deleteNavById(44);
        Assert.assertTrue(1==result);
    }

}