package com.leehom.news.po;

import lombok.Data;

import java.util.Date;

@Data
public class Vote {

    private Integer voteId;

    private String voteName;

    private String voteAddress;

    private Integer voteAge;

    private String voteJob;

    private String voteRemark;

    private Integer voteNumber;

    private Date createTime;

    private Date updateTime;

}
