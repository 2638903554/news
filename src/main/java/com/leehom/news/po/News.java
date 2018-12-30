package com.leehom.news.po;

import lombok.Data;
import java.util.Date;

@Data
public class News {

    /**
     * 新闻id
     */
    private Integer newsId;

    /**
     * 新闻标题
     */
    private String newsTitle;

    /**
     * 新闻内容
     */
    private String newsContent;

    /**
     * 该新闻数据所对应的二级导航的id
     */
    private Integer subnavId;

    /**
     * 新闻文章阅读量
     */
    private Integer newsViews;

    /**
     * 新闻文章评论数
     */
    private Integer newsWords;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
