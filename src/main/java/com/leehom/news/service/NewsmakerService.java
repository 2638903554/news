package com.leehom.news.service;

import com.leehom.news.po.Newsmaker;

import java.util.List;

public interface NewsmakerService {

    int insertNewsmaker(Newsmaker newsmaker);

    int deleteNewsmakerById(Integer newsmakerId);

    Newsmaker selectNewsmakerById(Integer newsmakerId);

    List<Newsmaker> selectAll();

    int updateNewsmaker(Newsmaker newsmaker);

}
