package com.leehom.news.dao;

import com.leehom.news.po.Newsmaker;

import java.util.List;

public interface NewsmakerDao {

    /**
     * 添加新闻人物
     * @param newsmaker
     * @return
     */
    int insertNewsmaker(Newsmaker newsmaker);

    /**
     * 删除新闻人物
     * @param newsmakerId
     * @return
     */
    int deleteNewsmakerById(Integer newsmakerId);

    /**
     * 根据id查找新闻人物
     * @param newsmakerId
     * @return
     */
    Newsmaker selectNewsmakerById(Integer newsmakerId);

    /**
     * 查找所有新闻人物
     * @return
     */
    List<Newsmaker> selectAll();

    /**
     * 更新新闻人物
     * @param newsmaker
     * @return
     */
    int updateNewsmaker(Newsmaker newsmaker);


}
