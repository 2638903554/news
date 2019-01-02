package com.leehom.news.controller;


import com.leehom.news.dto.WordsDto;
import com.leehom.news.po.Words;
import com.leehom.news.service.WordsService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/news/home/words")
public class HomeWordsController {
    @Autowired
    private WordsService wordsService;

    @PostMapping(value = "/insert")
    public ResultVO insert(@RequestBody Words words){
        wordsService.insertWords(words);
        return ResultVOUtil.success();
    }

    @GetMapping(value = "/list")
    public ResultVO list(@RequestParam(value = "newsId") Integer newsId){
        List<WordsDto> wordsDtoList = wordsService.selectAll(newsId);
        return ResultVOUtil.success(wordsDtoList);
    }
}
