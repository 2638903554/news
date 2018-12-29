package com.leehom.news.service;

import com.leehom.news.po.Newsmaker;

import java.util.List;

public interface NewsmakerService {
    List<Newsmaker> selectAll();
}
