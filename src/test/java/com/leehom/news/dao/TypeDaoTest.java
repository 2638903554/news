package com.leehom.news.dao;

import com.leehom.news.po.Type;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class TypeDaoTest extends BaseTest {

    @Autowired
    private TypeDao typeDao;

    @Test
    public void selectAll() throws Exception {
        List<Type> typeList = typeDao.selectAll();
        Assert.assertNotNull(typeList);
        Assert.assertTrue(typeList.size()>0);
    }

    @Test
    public void selectTypeByIdTest(){
        Type type = typeDao.selectTypeById(15);
        Assert.assertNotNull(type);
    }

    @Test
    public void updateTypeByIdTest(){
        Type type = typeDao.selectTypeById(44);
        type.setTypeName("音乐");
        int result = typeDao.updateTypeById(type);
        Assert.assertTrue(1==result);
    }

    @Test
    public void deleteTypeByIdTest(){
        int result = typeDao.deleteTypeById(44);
        Assert.assertTrue(1==result);
    }

    @Test
    public void insertTypeByIdTest(){
        Type type = new Type();
        type.setTypeName("编程");
        int result = typeDao.insertTypeById(type);
        Assert.assertTrue(1==result);
    }

}