package com.leehom.news.controller;

import com.leehom.news.dto.ArticleDto;
import com.leehom.news.po.News;
import com.leehom.news.service.NewsService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/news/home/news")
@Api(value = "/news/home/news",tags = "前台新闻信息接口")
public class HomeNewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping(value = "/select")
    public ResultVO select(@RequestParam("newsId") Integer newsId,
                           HttpSession session){
        ArticleDto articleDto = newsService.selectArticleDtoByNewsId(newsId);
        News news = newsService.selectByNewsId(newsId);
        news.setNewsViews(news.getNewsViews()+1);
        newsService.updateNews(news);
//        String str = session.getAttribute("newsId").toString();
//        if(str != null){
//            if(!newsId.equals(Integer.parseInt(str))){
//                News news = newsService.selectByNewsId(newsId);
//                news.setNewsViews(news.getNewsViews()+1);
//                newsService.updateNews(news);
//                session.setAttribute("newsId",newsId);
//            }
//        }
        return ResultVOUtil.success(articleDto);
    }

    @GetMapping(value = "/hot")
    public ResultVO hot(){
        List<ArticleDto> articleDtoList = newsService.selectArticleDtoByViews();
        return ResultVOUtil.success(articleDtoList);
    }

    @GetMapping(value = "day")
    public ResultVO day(){
        List<ArticleDto> articleDtoList = newsService.selectNewsOfTheDay();
        return ResultVOUtil.success(articleDtoList);
    }

}
