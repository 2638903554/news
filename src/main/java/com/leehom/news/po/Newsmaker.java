package com.leehom.news.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
//import com.leehom.news.utils.DateToLongSerializer;
import lombok.Data;

import java.util.Date;

@Data
public class Newsmaker {

    /**
     * 新闻人物id
     */
    private Integer newsmakerId;

    /**
     * 新闻人物姓名
     */
    private String newsmakerName;

    /**
     * 新闻人物地址
     */
    private String newsmakerAddress;

    /**
     * 新闻人物年龄
     */
    private Integer newsmakerAge;

    /**
     * 新闻人物工作
     */
    private String newsmakerJob;

    /**
     * 新闻人物简介
     */
    private String newsmakerRemark;

    /**
     * 投票数量
     */
    private Integer voteQuantity;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateTime;

}
