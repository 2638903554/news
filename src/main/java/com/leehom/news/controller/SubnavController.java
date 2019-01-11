package com.leehom.news.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leehom.news.dto.SubnavDto;
import com.leehom.news.po.Subnav;
import com.leehom.news.service.SubnavService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/news/admin/subnav")
public class SubnavController {

    @Autowired
    private SubnavService subnavService;

    @PostMapping(value = "/insert")
    @ApiOperation(value = "添加二级导航对象数据")
    public ResultVO insert(){
        return ResultVOUtil.success();
    }


    @GetMapping(value = "/delete")
    @ApiOperation(value = "根据id删除二级导航数据")
    public ResultVO delete(){
        return ResultVOUtil.success();
    }

    @GetMapping(value = "/selete")
    @ApiOperation(value = "根据id选择二级导航数据")
    public ResultVO select(@RequestParam(value = "subnavId")Integer subnavId){

        Subnav subnav = subnavService.selectBySubnavId(subnavId);

        return ResultVOUtil.success(subnav);
    }

    @GetMapping(value = "/list")
    @ApiOperation(value = "获取所有二级导航数据")
    public ResultVO list(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                         @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<SubnavDto> subnavDtoList = subnavService.selectSubnavWithNavNameAll();
        PageInfo pageInfo = new PageInfo(subnavDtoList);
        return ResultVOUtil.success(pageInfo);
    }

    @PostMapping(value = "/update")
    @ApiOperation(value = "更新二级导航对象数据")
    public ResultVO update(){
        return ResultVOUtil.success();
    }

}
