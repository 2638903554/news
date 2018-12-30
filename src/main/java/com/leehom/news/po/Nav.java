package com.leehom.news.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Nav {

    /**
     * 一级导航id
     */
    private Integer navId;

    /**
     * 一级导航名字
     */
    private String navName;

    /**
     * 一级导航简介
     */
    private String navRemark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
