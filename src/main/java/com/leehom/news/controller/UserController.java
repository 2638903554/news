package com.leehom.news.controller;

import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.User;
import com.leehom.news.service.UserService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/news/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/home/register")
    @ApiOperation(value = "前台接口：用户注册")
    public ResultVO register(@RequestBody User user){
        boolean result = userService.userRegister(user);
        if(result == false){
            throw new NewsException(ResultEnum.USER_REGISTER_FAIL);
        }

        return ResultVOUtil.success(user);
    }

    @PostMapping(value = "/home/login")
    @ApiOperation(value = "前台接口：用户登录")
    public ResultVO login(@RequestBody User user){
        User result = userService.userLogin(user);
        if(result == null){
            log.error("用户登录：账号或密码错误.{}",user);
            throw new NewsException(ResultEnum.LOGIN_ERROR);
        }
        return ResultVOUtil.success(result);
    }

    @GetMapping(value = "/admin/select")
    @ApiOperation(value = "后台接口：根据用户id查找用户")
    public ResultVO select(@RequestParam("userId") Integer userId){
        User user = userService.selectUserById(userId);
        if(user == null){
            log.error("根据用户id查询用户，userId={}",userId);
            throw new NewsException(ResultEnum.USER_ID_ERROR);
        }
        return ResultVOUtil.success(user);
    }

    @GetMapping(value = "/admin/list")
    @ApiOperation(value = "后台接口：获取所有用户数据")
    public ResultVO list(){
        List<User> userList = userService.selectAll();
        return ResultVOUtil.success(userList);
    }

}
