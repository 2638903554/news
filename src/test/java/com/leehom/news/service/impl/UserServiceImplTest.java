package com.leehom.news.service.impl;

import com.leehom.news.dao.BaseTest;
import com.leehom.news.po.User;
import com.leehom.news.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceImplTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void selectAll() throws Exception {
        List<User> userList = userService.selectAll();
        Assert.assertNotNull(userList);
    }

    @Test
    public void insertUsertTest(){
        User user = new User();
        user.setUserName("zou");
        user.setUserPhone("12333333333");
        user.setUserPass("123445");
        int result = userService.insertUsert(user);
        Assert.assertTrue(1 == result);
    }

}