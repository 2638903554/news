package com.leehom.news.service.impl;

import com.leehom.news.dao.BaseTest;
import com.leehom.news.dto.WordsDto;
import com.leehom.news.po.Words;
import com.leehom.news.service.WordsService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class WordsServiceImplTest extends BaseTest {

    @Autowired
    private WordsService wordsService;

    @Test
    public void insertWords() throws Exception {
        Words words = new Words();
        words.setUserId(1);
        words.setNewsId(1);
        words.setWordsContent("zzzz");
        wordsService.insertWords(words);

    }

    @Test
    public void selectAll() throws Exception {
        List<WordsDto> wordsDtoList = wordsService.selectAll(1);
        Assert.assertNotNull(wordsDtoList);
    }

}