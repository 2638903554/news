package com.leehom.news.service.impl;

import com.leehom.news.dao.BaseTest;
import com.leehom.news.po.Detail;
import com.leehom.news.service.DetailService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class DetailServiceImplTest extends BaseTest {

    @Autowired
    private DetailService detailService;

    @Test
    public void selectByDetailIdTest() {
        Detail detail = detailService.selectByDetailId(38);
        Assert.assertNotNull(detail);
    }
}