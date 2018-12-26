package com.leehom.news.dao;

import com.leehom.news.po.Link;
import java.util.List;

public interface LinkDao {

    List<Link> selectAll();

}
