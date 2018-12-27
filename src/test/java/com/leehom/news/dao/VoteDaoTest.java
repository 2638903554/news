package com.leehom.news.dao;

import com.leehom.news.po.Vote;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class VoteDaoTest extends BaseTest {

    @Autowired
    private VoteDao voteDao;

    @Test
    public void selectAllTest(){
        List<Vote> voteList = voteDao.selectAll();
        Assert.assertNotNull(voteList);
        Assert.assertTrue(voteList.size() > 0);

    }

}