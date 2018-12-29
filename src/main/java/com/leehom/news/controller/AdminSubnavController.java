package com.leehom.news.controller;

import com.leehom.news.service.SubnavService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/news/admin/subnav")
public class AdminSubnavController {

    @Autowired
    private SubnavService subnavService;

    @PostMapping(value = "/insert")
    public ResultVO insert(){
        return ResultVOUtil.success();
    }


    @GetMapping(value = "/delete")
    public ResultVO delte(){
        return ResultVOUtil.success();
    }

    @GetMapping(value = "/selete")
    public ResultVO select(){
        return ResultVOUtil.success();
    }

    @GetMapping(value = "/list")
    public ResultVO list(){
        return ResultVOUtil.success();
    }

    @PostMapping(value = "/update")
    public ResultVO update(){
        return ResultVOUtil.success();
    }

}
