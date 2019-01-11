package com.leehom.news.service.impl;

import com.leehom.news.dao.BaseTest;
import com.leehom.news.po.Manager;
import com.leehom.news.service.ManagerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

@Slf4j
public class ManagerServiceImplTest extends BaseTest {

    @Autowired
    private ManagerService managerService;

    @Test
    public void selectManagerByNameTest(){
        Manager manager = managerService.selectManagerByName("szpt");
        Assert.assertNotNull(manager);
    }

    @Test
    public void managerLoginTest(){
        Manager manager = new Manager();
        manager.setManagerUser("szpt");
        manager.setManagerPass("123456");
        boolean flag = managerService.managerLogin(manager);
        Assert.assertTrue(flag);
    }


}