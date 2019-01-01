package com.leehom.news.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.Nav;
import com.leehom.news.service.NavService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/news/admin/nav")
@RestController
@Slf4j
@Api(value = "/nav",tags = "后台一级导航相关接口")
public class AdminNavController {

    @Autowired
    private NavService navService;

    @PostMapping(value = "/insert")
    public ResultVO insert(@RequestParam("navName") String navName){

        Nav nav = new Nav();
        nav.setNavName(navName);
        int result = navService.insertNav(nav);
        if(result != 1){
            throw new NewsException(ResultEnum.INSERT_NAV_FAIL);
        }
        return ResultVOUtil.success(nav);
    }

    @GetMapping(value = "delete")
    public ResultVO delete(@RequestParam("navId") Integer navId){
        Nav nav = navService.selectNavById(navId);
        if(nav == null){
            log.error("【后台删除单条nav记录】,nvaId = {}",navId);
            throw new NewsException(ResultEnum.SELECT_NAV_FAIL);
        }
        navService.deleteNavById(navId);
        return ResultVOUtil.success(nav);
    }

    @GetMapping(value = "/select")
    public ResultVO select(@RequestParam("navId") Integer navId){
        Nav nav = navService.selectNavById(navId);
        if(nav == null){
            throw new NewsException(ResultEnum.SELECT_NAV_FAIL);
        }
        return ResultVOUtil.success(nav);
    }

    @GetMapping(value = "/list")
    public ResultVO list(){
//        PageHelper.startPage(pageNum,pageSize);
        List<Nav> navList = navService.selectAll();
//        PageInfo pageInfo = new PageInfo(navList);
        return ResultVOUtil.success(navList);
    }

    @PostMapping(value = "update")
    public ResultVO update(@RequestBody Nav nav){
        Nav result = navService.selectNavById(nav.getNavId());
        if(result == null){
            throw new NewsException(ResultEnum.SELECT_NAV_FAIL);
        }
        result.setNavName(nav.getNavName());
        if(navService.updateNav(result) != 1){
            throw new NewsException(ResultEnum.UPDATE_NAV_FAIL);
        }
        return ResultVOUtil.success(nav);
    }

}
