package com.leehom.news.service.impl;

import com.leehom.news.dao.BaseTest;
import com.leehom.news.po.Subnav;
import com.leehom.news.service.SubnavService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class SubnavServiceImplTest extends BaseTest {

    @Autowired
    private SubnavService subnavService;

    @Test
    public void selectByDetailIdTest() {
        Subnav subnav = subnavService.selectBySubnavId(38);
        Assert.assertNotNull(subnav);
    }
}