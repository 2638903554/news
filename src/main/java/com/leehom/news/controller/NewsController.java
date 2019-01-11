package com.leehom.news.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leehom.news.dto.ArticleDto;
import com.leehom.news.dto.NewsDto;
import com.leehom.news.po.News;
import com.leehom.news.service.NewsService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping(value = "/news/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping(value = "/list")
    @ApiOperation(value = "后台/前台接口：查找所有新闻信息")
    public ResultVO list(){
        List<NewsDto> newsDtoList = newsService.selectAll();
        return ResultVOUtil.success(newsDtoList);
    }

    @GetMapping(value = "/admin/count")
    @ApiOperation(value = "后台接口：计算新闻信息总数")
    public ResultVO count(){
        Integer result = newsService.newsCount();
        return ResultVOUtil.success(result);
    }

    @GetMapping(value = "/admin/views")
    @ApiOperation(value = "后台接口：计算新闻信息总访问量")
    public ResultVO views(){
        Integer result = newsService.countViews();
        return ResultVOUtil.success(result);
    }

    @GetMapping(value = "/select")
    @ApiOperation(value = "前台/后台接口：根据新闻id获取新闻详情")
    public ResultVO select(@RequestParam("newsId") Integer newsId){
        ArticleDto articleDto = newsService.selectArticleDtoByNewsId(newsId);
        News news = newsService.selectByNewsId(newsId);
        news.setNewsViews(news.getNewsViews()+1);
        newsService.updateNews(news);
        return ResultVOUtil.success(articleDto);
    }

    @GetMapping(value = "/home/hot")
    @ApiOperation(value = "前台接口：获取热点精选的新闻")
    public ResultVO hot(){
        List<ArticleDto> articleDtoList = newsService.selectArticleDtoByViews();
        return ResultVOUtil.success(articleDtoList);
    }

    @GetMapping(value = "/home/day")
    @ApiOperation(value = "前台接口：获取当日的新闻")
    public ResultVO day(){
        List<ArticleDto> articleDtoList = newsService.selectNewsOfTheDay();
        return ResultVOUtil.success(articleDtoList);
    }


}
