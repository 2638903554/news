package com.leehom.news.controller;

import com.leehom.news.dto.ArticleDto;
import com.leehom.news.service.NavService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/news/home/nav")
@Api(value = "/news/home/nav",tags = "前台一级导航接口")
public class HomeNavController {

    @Autowired
    private NavService navService;

    @GetMapping(value = "/type")
    public ResultVO type(@RequestParam("navId") Integer navId){
        List<ArticleDto> articleDtoList = navService.selectAllArticleByNavId(navId);
        return ResultVOUtil.success(articleDtoList);
    }

}
