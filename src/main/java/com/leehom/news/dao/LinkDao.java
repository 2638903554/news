package com.leehom.news.dao;

import com.leehom.news.po.Link;

import java.util.List;


public interface LinkDao {

    Link selectLinkById(Integer linkId);

    List<Link> selectAll();

    Link selectByLink(Link link);

}
