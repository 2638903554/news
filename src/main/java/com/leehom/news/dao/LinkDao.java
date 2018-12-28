package com.leehom.news.dao;

import com.leehom.news.po.Link;
import java.util.List;

public interface LinkDao {

    int insertLink(Link link);

    int deleteLinkById(Integer linkId);

    Link selectLinkById(Integer linkId);

    List<Link> selectAll();

    int updateLink(Link link);


}
