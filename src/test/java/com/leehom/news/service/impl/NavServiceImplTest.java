package com.leehom.news.service.impl;

import com.leehom.news.dao.BaseTest;
import com.leehom.news.po.Nav;
import com.leehom.news.service.NavService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NavServiceImplTest extends BaseTest {

    @Autowired
    private NavService navService;

    @Test
    public void insertNavByIdTest(){
        Nav nav = new Nav();
        nav.setNavName("教育");
        int result = navService.insertNav(nav);
        Assert.assertTrue(1 == result);
    }

    @Test
    public void deleteNavByIdTest(){
        int result = navService.deleteNavById(15);
        Assert.assertTrue(1==result);
    }

    @Test
    public void selectAll() throws Exception {
        List<Nav> navList = navService.selectAll();
        Assert.assertNotNull(navList);
        Assert.assertTrue(navList.size() > 0);
    }

    @Test
    public void selectNavByIdTest(){
        Nav nav = navService.selectNavById(15);
        Assert.assertNotNull(nav);
    }

    @Test
    public void updateNavTest(){
        Nav nav = navService.selectNavById(45);
        nav.setNavName("实验");
        int result = navService.updateNav(nav);
        Assert.assertTrue(1==result);
    }

}