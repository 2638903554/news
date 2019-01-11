package com.leehom.news.controller;

import com.leehom.news.dto.ArticleDto;
import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.Nav;
import com.leehom.news.service.NavService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/news/nav")
@RestController
@Slf4j
public class NavController {

    @Autowired
    private NavService navService;

    @PostMapping(value = "/admin/insert")
    @ApiOperation(value = "后台接口：添加单条一级导航数据")
    public ResultVO insert(@RequestBody Nav nav){
        int result = navService.insertNav(nav);
        if(result != 1){
            throw new NewsException(ResultEnum.INSERT_NAV_FAIL);
        }
        return ResultVOUtil.success(nav);
    }

    @GetMapping(value = "/admin/delete")
    @ApiOperation(value = "后台接口：根据navId删除单条一级导航数据")
    public ResultVO delete(@RequestParam("navId") Integer navId){
        Nav nav = navService.selectNavById(navId);
        if(nav == null){
            log.error("【后台删除单条nav记录】,nvaId = {}",navId);
            throw new NewsException(ResultEnum.SELECT_NAV_FAIL);
        }
        navService.deleteNavById(navId);
        return ResultVOUtil.success(nav);
    }

    @GetMapping(value = "/admin/select")
    @ApiOperation(value = "后台接口：根据navId查找单条一级导航数据")
    public ResultVO select(@RequestParam("navId") Integer navId){
        Nav nav = navService.selectNavById(navId);
        if(nav == null){
            throw new NewsException(ResultEnum.SELECT_NAV_FAIL);
        }
        return ResultVOUtil.success(nav);
    }

    @GetMapping(value = "/list")
    @ApiOperation(value = "后台/前台接口：查找所有一级导航")
    public ResultVO list(){
        List<Nav> navList = navService.selectAll();
        return ResultVOUtil.success(navList);
    }

    @GetMapping(value = "/home/type")
    @ApiOperation(value = "前台接口：根据navId查找所有新闻数据")
    public ResultVO type(@RequestParam("navId") Integer navId){
        List<ArticleDto> articleDtoList = navService.selectAllArticleByNavId(navId);
        return ResultVOUtil.success(articleDtoList);
    }

    @PostMapping(value = "/admin/update")
    @ApiOperation(value = "后台接口：更新单条一级导航数据")
    public ResultVO update(@RequestBody Nav nav){
        Nav result = navService.selectNavById(nav.getNavId());
        if(result == null){
            throw new NewsException(ResultEnum.SELECT_NAV_FAIL);
        }
        result.setNavName(nav.getNavName());
        result.setNavRemark(nav.getNavRemark());
        if(navService.updateNav(result) != 1){
            throw new NewsException(ResultEnum.UPDATE_NAV_FAIL);
        }
        return ResultVOUtil.success(result);
    }

}
