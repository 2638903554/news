package com.leehom.news.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leehom.news.po.User;
import com.leehom.news.service.UserService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/news/admin/user")
@Api(value = "/news/admin/user",tags = "后台用户管理接口")
public class AdminUserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/list")
    public ResultVO list(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                         @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> userList = userService.selectAll();
        PageInfo pageInfo = new PageInfo(userList);
        return ResultVOUtil.success(pageInfo);
    }
}
