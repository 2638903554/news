package com.leehom.news.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.Nav;
import com.leehom.news.service.NavService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/news/admin/nav")
@RestController
@Slf4j
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

//    @GetMapping(value = "delete")
//    public ResultVO delete(@RequestParam("navId") Integer navId){
//        Nav nav = navService.selectNavById(navId);
//        if(nav == null){
//            throw new NewsException(ResultEnum.SELECT_NAV_FAIL);
//        }
//        int result = navService.deleteNavById(navId);
//        if(result != 1){
//            throw new NewsException(ResultEnum.DELETE_NAV_FAIL)
//        }
//        return ResultVOUtil.success(nav);
//    }

    @GetMapping(value = "/select")
    public ResultVO select(@RequestParam("navId") Integer navId){
        Nav nav = navService.selectNavById(navId);
        if(nav == null){
            throw new NewsException(ResultEnum.SELECT_NAV_FAIL);
        }
        return ResultVOUtil.success(nav);
    }

    @GetMapping(value = "/list")
    public ResultVO list(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                         @RequestParam(value = "pageSize",defaultValue = "4") int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Nav> navList = navService.selectAll();
        PageInfo pageInfo = new PageInfo(navList);
        return ResultVOUtil.success(pageInfo);
    }

    @PostMapping(value = "update")
    public ResultVO update(@RequestParam("navId") Integer navId,
                           @RequestParam("navName") String navName){
        Nav nav = navService.selectNavById(navId);
        if(nav == null){
            throw new NewsException(ResultEnum.SELECT_NAV_FAIL);
        }
        nav.setNavName(navName);
        int result = navService.updateNav(nav);
        if(result != 1){
            throw new NewsException(ResultEnum.UPDATE_NAV_FAIL);
        }
        return ResultVOUtil.success(nav);
    }

}
