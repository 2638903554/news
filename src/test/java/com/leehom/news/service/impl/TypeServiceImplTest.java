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
    public void selectAll() throws Exception {
        List<Type> typeList = typeService.selectAll();
        Assert.assertNotNull(typeList);
        Assert.assertTrue(typeList.size() > 0);
    }

    @Test
    public void deleteTypeByIdTest(){
        int result = typeService.deleteTypeById(45);
        Assert.assertTrue(1==result);
    }

}