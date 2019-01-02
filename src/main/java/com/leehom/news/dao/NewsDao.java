package com.leehom.news.dao;

import com.leehom.news.dto.ArticleDto;
import com.leehom.news.dto.NewsDto;
import com.leehom.news.po.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface NewsDao {

    News selectNewsById(Integer newsId);


    List<News> selectAllBySubnavId(Integer subnavId);

    List<NewsDto> selectAll();

    ArticleDto selectArticleDtoByNewsId(Integer newsId);

    List<ArticleDto> selectArticleDtoByViews();

    List<ArticleDto> selectNewsOfTheDay();

    /**
     * 根据typeId和keyWord进行模糊查询
     * @param typeId
     * @param newsTitle
     * @return
     */
    List<NewsDto> selectNewsByTypeIdAndKeyWord(@Param("typeId") Integer typeId,
                                               @Param("newsTitle") String newsTitle);


    /**
     * 查看新闻条数
     * @return
     */
    Integer newsCount();

    /**
     * 计算总访问量
     * @return
     */
    Integer countViews();

    int updateNews(News news);



}
