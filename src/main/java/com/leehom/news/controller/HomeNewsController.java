package com.leehom.news.controller;

import com.leehom.news.dto.ArticleDto;
import com.leehom.news.service.NewsService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/news/home/news")
public class HomeNewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping(value = "/select")
    public ResultVO select(@RequestParam("newsId") Integer newsId){
        ArticleDto articleDto = newsService.selectArticleDtoByNewsId(newsId);
        return ResultVOUtil.success(articleDto);
    }

    @GetMapping(value = "/hot")
    public ResultVO hot(){
        List<ArticleDto> articleDtoList = newsService.selectArticleDtoByViews();
        return ResultVOUtil.success(articleDtoList);
    }

}
