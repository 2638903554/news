package com.leehom.news.service;

import com.leehom.news.po.Vote;

import java.util.List;

public interface VoteService {
    List<Vote> selectAll();
}
