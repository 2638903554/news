package com.leehom.news.service.impl;

import com.leehom.news.dao.UserDao;
import com.leehom.news.po.User;
import com.leehom.news.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }
}
