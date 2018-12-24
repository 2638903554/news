package com.leehom.news.dao;

import com.leehom.news.po.Vote;

public interface VoteDao {

    int insert(Vote vote);

    /**
     * 通过Id或Name进行查询
     * @param vote
     * @return
     */
    Vote selectByIdOrName(Vote vote);

    /**
     * 使用where标签来进行查询
     * @param vote
     * @return
     */
    Vote selectByVote(Vote vote);


}
