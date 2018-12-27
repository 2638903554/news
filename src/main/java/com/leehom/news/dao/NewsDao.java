package com.leehom.news.dao;

import com.leehom.news.dto.NewsDto;
import com.leehom.news.po.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface NewsDao {


    News selectByNewsId(Integer newsId);

    List<NewsDto> selectAllByNewsId(Integer newsId);



    List<NewsDto> selectAll();

    /**
     * 根据typeId和keyWord进行模糊查询
     * @param typeId
     * @param newsTitle
     * @return
     */
    List<NewsDto> selectNewsByTypeIdAndKeyWord(@Param("typeId") Integer typeId,
                                               @Param("newsTitle") String newsTitle);


    /**
     * 查询各类型新闻前3条数据，用于首页显示
     * @param typeId
     * @return
     */
    List<NewsDto> selectThreeNewsByTypeId(@Param("typeId") Integer typeId);

    List<NewsDto> selectNewsByTypeId(@Param("typeId") Integer typeId);

}
