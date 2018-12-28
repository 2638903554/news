package com.leehom.news.service.impl;

import com.leehom.news.dao.BaseTest;
import com.leehom.news.po.Type;
import com.leehom.news.service.TypeService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class TypeServiceImplTest extends BaseTest {

    @Autowired
    private TypeService typeService;

    @Test
    public void insertTypeByIdTest(){
        Type type = new Type();
        type.setTypeName("教育");
        int result = typeService.insertType(type);
        Assert.assertTrue(1==result);
    }

    @Test
    public void deleteTypeByIdTest(){
        int result = typeService.deleteTypeById(45);
        Assert.assertTrue(1==result);
    }

    @Test
    public void selectAll() throws Exception {
        List<Type> typeList = typeService.selectAll();
        Assert.assertNotNull(typeList);
        Assert.assertTrue(typeList.size() > 0);
    }

    @Test
    public void selectTypeByIdTest(){
        Type type = typeService.selectTypeById(15);
        Assert.assertNotNull(type);
    }

    @Test
    public void updateTypeByIdTest(){
        Type type = typeService.selectTypeById(46);
        type.setTypeName("实验");
        int result = typeService.updateType(type);
        Assert.assertTrue(1==result);
    }

}