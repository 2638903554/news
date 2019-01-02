package com.leehom.news.dao;

import com.leehom.news.dto.WordsDto;
import com.leehom.news.po.Words;

import java.util.List;

public interface WordsDao {

    int insertWords(Words words);

    List<WordsDto> selectAll(Integer newsId);

}
