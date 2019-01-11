package com.leehom.news.controller;

import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.Manager;
import com.leehom.news.service.ManagerService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/news/manager")
@Slf4j
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @PostMapping(value = "/home/login")
    @ApiOperation(value = "前台接口：管理员登录")
    public ResultVO login(@RequestBody Manager manager){
        boolean flag = managerService.managerLogin(manager);
        if(flag == false){
            log.info("管理员用户登录参数错误，{}",manager);
            throw new NewsException(ResultEnum.MANAGER_PARAM_ERROR);
        }
        return ResultVOUtil.success();
    }

}
