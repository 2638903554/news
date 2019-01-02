package com.leehom.news.service.impl;

import com.leehom.news.dao.UserDao;
import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.User;
import com.leehom.news.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public User selectUserById(Integer userId) {
        return userDao.selectUserByUserId(userId);
    }

    @Override
    public User userLogin(User user) {
        boolean flag = true;
        User user1 = userDao.selectUserByUserName(user.getUserName());
        if(user1 == null){
            log.error("用户登录，该用户不存在。{}",user);
            throw new NewsException(ResultEnum.USER_NAME_EMPTY);
        }
        if(!user1.getUserPass().equals(user.getUserPass())){
            log.error("用户登录，用户密码错误。{}",user);
            throw new NewsException(ResultEnum.USER_PASS_ERROR);
        }
        return user1;
    }

    /**
     * 用户注册，返回true表示注册成功，返回false表示注册失败
     * @param user
     * @return
     */
    public boolean userRegister(User user) {
        boolean flag = true;
        User user1 = userDao.selectUserByUserName(user.getUserName());
        if(user1 != null){
            log.error("用户注册：该账号已注册，{}",user);
            throw new NewsException(ResultEnum.USER_NAME_EXIST);
        }
        user1 = userDao.selectUserByUserPhone(user.getUserPhone());
        if(user1 != null){
            log.error("用户注册：该电话号码已注册,{}",user);
            throw new NewsException(ResultEnum.USER_PHONE_EXIST);
        }
        int result = userDao.insertUser(user);
        return flag;
    }

    @Override
    public int insertUsert(User user) {
        return userDao.insertUser(user);
    }

//    @Override
//    public User selectUserByUserName(String userName) {
//        return userDao.selectUserByUserName(userName);
//    }
}
