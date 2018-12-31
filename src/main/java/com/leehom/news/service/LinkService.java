package com.leehom.news.service;

import com.leehom.news.po.Link;

import java.util.List;

public interface LinkService {

    int insertLink(Link link);

    int deleteLinkById(Integer linkId);

    Link selectLinkById(Integer linkId);

    List<Link> selectAll();

    int updateLink(Link link);

    Integer countLink();

}
