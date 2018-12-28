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

    public static Integer LINKID = 16;

    @Autowired
    private LinkService linkService;

    @Test
    public void insertLinkTest(){
        Link link = new Link();
        link.setLinkName("ins");
        link.setLinkUrl("http://ins.cn");
        int result = linkService.insertLink(link);
        Assert.assertTrue(1==result);
    }

    @Test
    public void deleteLinkByIdTest(){
        int result = linkService.deleteLinkById(LINKID);
        Assert.assertTrue(1 == result);

    }

    @Test
    public void selectAllTest() {
        List<Link> linkList = linkService.selectAll();
        Assert.assertNotNull(linkList);
        Assert.assertTrue(linkList.size()>0);
    }

    @Test
    public void selectLinkByIdTest(){
        Link link = linkService.selectLinkById(LINKID);
        Assert.assertNotNull(link);
    }

    @Test
    public void updateLinkTest(){
        Link link = linkService.selectLinkById(LINKID);
        link.setLinkName("深圳大学");
        link.setLinkUrl("https://www.szpt.edu.cn");
        int result = linkService.updateLink(link);
        Assert.assertTrue(1 == result);
    }

}