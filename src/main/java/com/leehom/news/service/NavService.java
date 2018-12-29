package com.leehom.news.service;

import com.leehom.news.po.Nav;

import java.util.List;

public interface NavService {

    int insertNav(Nav nav);

    int deleteNavById(Integer navId);

    Nav selectNavById(Integer navId);

    List<Nav> selectAll();

    int updateNav(Nav nav);





}
