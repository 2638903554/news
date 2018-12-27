package com.leehom.news.dao;

import com.leehom.news.po.Detail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DetailDaoTest extends BaseTest {

    @Autowired
    private DetailDao detailDao;

    @Test
    public void selectByDetailIdTest(){
        Detail detail = detailDao.selectByDetailId(15);
        Assert.assertNotNull(detail);
    }

    @Test
    public void selectDetailListByTypeIdTest(){
        List<Detail> detailList = detailDao.selectDetailListByTypeId(15);
        Assert.assertNotNull(detailList);
        Assert.assertTrue(detailList.size() > 0);
    }

}