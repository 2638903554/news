package com.leehom.news.service;

import com.leehom.news.po.Link;

import java.util.List;

public interface LinkService {

    int insertLink(Link link);

    

    List<Link> selectAll();

}
