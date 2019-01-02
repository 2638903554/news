//package com.leehom.news.controller;
//
//import com.leehom.news.dto.NewsDto;
//import com.leehom.news.po.Nav;
//import com.leehom.news.po.News;
//import com.leehom.news.service.NewsService;
//import com.leehom.news.service.NavService;
//import com.leehom.news.utils.ResultVOUtil;
//import com.leehom.news.vo.ResultVO;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@Slf4j
//@RequestMapping(value = "/news/index/news")
//public class NewsController {
//
//    @Autowired
//    private NewsService newsService;
//
//    @GetMapping(value = "/select")
//    public ResultVO select(@RequestParam(value = "newsId") Integer newsId){
//        News news = newsService.selectByNewsId(newsId);
//        return ResultVOUtil.success(news);
//    }
//
//}
