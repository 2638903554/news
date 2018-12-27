package com.leehom.news.service.impl;

import com.leehom.news.dao.VoteDao;
import com.leehom.news.po.Vote;
import com.leehom.news.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteDao voteDao;

    @Override
    public List<Vote> selectAll() {
        return voteDao.selectAll();
    }
}
