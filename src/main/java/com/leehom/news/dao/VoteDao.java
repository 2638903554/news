package com.leehom.news.dao;

import com.leehom.news.po.Vote;

import java.util.List;

public interface VoteDao {

    List<Vote> selectAll();

}
