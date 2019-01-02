package com.leehom.news.service;

import com.leehom.news.po.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {

    List<User> selectAll();

    int insertUsert(User user);

    User userLogin(User user);

    boolean userRegister(User user);

    User selectUserById(Integer userId);
}
