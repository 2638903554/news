package com.leehom.news.service.impl;

import com.leehom.news.dao.BaseTest;
import com.leehom.news.po.Vote;
import com.leehom.news.service.VoteService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class VoteServiceImplTest extends BaseTest{

    @Autowired
    private VoteService voteService;

    @Test
    public void selectAllTest() throws Exception {
        List<Vote> voteList = voteService.selectAll();
        Assert.assertNotNull(voteList);
        Assert.assertTrue(voteList.size() > 0);
    }

}