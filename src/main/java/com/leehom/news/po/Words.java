package com.leehom.news.po;

import lombok.Data;

import java.util.Date;

@Data
public class Words {

    private Integer wordsId;

    private Integer userId;

    private String wordsContent;

    private Integer newsId;

    private Date createTime;

}
