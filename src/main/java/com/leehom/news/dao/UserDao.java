package com.leehom.news.dao;

import com.leehom.news.po.User;

import java.util.List;

public interface UserDao {
    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    User selectUserByUserName(String userName);

    /**
     * 根据手机号码查找用户
     * @param userPhone
     * @return
     */
    User selectUserByUserPhone(String userPhone);

    /**
     * 查找所有用户
     * @return
     */
    List<User> selectAll();

    /**
     * 添加用户
     * @param user
     * @return
     */
    int insertUser(User user);



}
