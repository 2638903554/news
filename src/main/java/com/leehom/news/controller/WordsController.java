package com.leehom.news.controller;


import com.leehom.news.dto.WordsDto;
import com.leehom.news.po.Words;
import com.leehom.news.service.WordsService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/news/words")
public class WordsController {
    @Autowired
    private WordsService wordsService;

    @PostMapping(value = "/home/insert")
    @ApiOperation(value = "前台接口：添加留言")
    public ResultVO insert(@RequestBody Words words){
        wordsService.insertWords(words);
        return ResultVOUtil.success();
    }

    @GetMapping(value = "/home/list")
    @ApiOperation(value = "前台接口：根据新闻id查找留言")
    public ResultVO list(@RequestParam(value = "newsId") Integer newsId){
        List<WordsDto> wordsDtoList = wordsService.selectAll(newsId);
        return ResultVOUtil.success(wordsDtoList);
    }
}
