package com.leehom.news.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leehom.news.dto.SubnavDto;
import com.leehom.news.po.Subnav;
import com.leehom.news.service.SubnavService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResultVO list(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                         @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<SubnavDto> subnavDtoList = subnavService.selectSubnavWithNavNameAll();
        PageInfo pageInfo = new PageInfo(subnavDtoList);
        return ResultVOUtil.success(pageInfo);
    }

    @PostMapping(value = "/update")
    public ResultVO update(){
        return ResultVOUtil.success();
    }

}
