package com.leehom.news.dao;

import com.leehom.news.po.User;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
}
