package com.leehom.news.service;

import com.leehom.news.dto.WordsDto;
import com.leehom.news.po.Words;

import java.util.List;

public interface WordsService {

    void insertWords(Words words);

    List<WordsDto> selectAll(Integer newsId);

}
