package com.leehom.news.dao;

import com.leehom.news.po.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void selectAll() throws Exception {
    }

    @Test
    public void insertUser() throws Exception {
        User user = new User();
        user.setUserName("zou");
        user.setUserPass("123456");
        user.setUserPhone("12345678909");
        int result = userDao.insertUser(user);
        Assert.assertTrue( 1 == result );
    }

    @Test
    public void selectUserByUserNameTest(){
        User user = userDao.selectUserByUserName("leehom");
        Assert.assertTrue(user!= null);
    }

    @Test
    public void countTest(){
//        Integer result = userDao
    }

    @Test
    public void selectUserByUserPhoneTest(){
        User user = userDao.selectUserByUserPhone("15602962574");
        Assert.assertNotNull(user);
    }

}