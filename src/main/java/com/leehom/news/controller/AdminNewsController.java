package com.leehom.news.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leehom.news.dto.NewsDto;
import com.leehom.news.service.NewsService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/news/admin/news")
public class AdminNewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping(value = "/list")
    public ResultVO list(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                         @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<NewsDto> newsDtoList = newsService.selectAll();
        PageInfo pageInfo = new PageInfo(newsDtoList);
        return ResultVOUtil.success(pageInfo);
    }

    @GetMapping(value = "/count")
    public ResultVO count(){
        Integer result = newsService.newsCount();
        return ResultVOUtil.success(result);
    }

    @GetMapping(value = "/views")
    public ResultVO views(){
        Integer result = newsService.countViews();
        return ResultVOUtil.success(result);
    }
}
