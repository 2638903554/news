package com.leehom.news.dao;

import com.leehom.news.dto.WordsDto;
import com.leehom.news.po.Words;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class WordsDaoTest extends BaseTest {

    @Autowired
    private WordsDao wordsDao;

    @Test
    public void insertWords() throws Exception {
        Words words = new Words();
        words.setNewsId(1);
        words.setUserId(2);
        words.setWordsContent("yyyy");
        wordsDao.insertWords(words);

    }

    @Test
    public void selectAllTest(){
        Integer NEWSID = 1;
        List<WordsDto> wordsDtoList = wordsDao.selectAll(NEWSID);
        Assert.assertNotNull(wordsDtoList);
    }

}