package com.leehom.news.service.impl;

import com.leehom.news.dao.BaseTest;
import com.leehom.news.po.Link;
import com.leehom.news.service.LinkService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class LinkServiceImplTest extends BaseTest {


    @Autowired
    private LinkService linkService;

    @Test
    public void selectAllTest() {
        List<Link> linkList = linkService.selectAll();
        Assert.assertNotNull(linkList);
        Assert.assertTrue(linkList.size()>0);
    }
}