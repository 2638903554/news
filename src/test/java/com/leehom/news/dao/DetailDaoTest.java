package com.leehom.news.dao;

import com.leehom.news.po.Detail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DetailDaoTest extends BaseTest {

    @Autowired
    private DetailDao detailDao;

    @Test
    public void selectByDetailIdTest(){
        Detail detail = detailDao.selectByDetailId(38);
        Assert.assertNotNull(detail);

    }

}