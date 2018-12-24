package com.leehom.news.dao;

import com.leehom.news.po.Vote;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class VoteDaoTest extends BaseDaoTest{


    //有bug,待解决
    @Test
    public void insertTest() {
        SqlSession sqlSession = getSqlSession();
        try {
            Vote vote = new Vote();
            vote.setVoteName("zou");
            vote.setVoteAddress("深职院北校区");
            vote.setVoteAge(21);
            vote.setVoteNumber(24);
            vote.setVoteJob("student");
            vote.setVoteRemark("hehe");
            VoteDao voteDao = sqlSession.getMapper(VoteDao.class);
            int result = voteDao.insert(vote);

        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }


    @Test
    public void selectByIdOrNameTest(){
        SqlSession sqlSession = getSqlSession();
        try {
            VoteDao voteDao = sqlSession.getMapper(VoteDao.class);
            Vote vote = new Vote();
//            vote.setVoteId(9);
            vote.setVoteName("吴敏霞");
            Vote result = voteDao.selectByIdOrName(vote);
            Assert.assertNotNull(result);
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void selectByVoteTest(){
        SqlSession sqlSession = getSqlSession();
        try {
            VoteDao voteDao = sqlSession.getMapper(VoteDao.class);
            Vote vote = new Vote();
            vote.setVoteId(14);
            vote.setVoteName("leehom");
            Vote result = voteDao.selectByVote(vote);
            Assert.assertNotNull(result);
        }finally {
            sqlSession.close();
        }
    }
}