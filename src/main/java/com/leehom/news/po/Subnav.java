package com.leehom.news.po;

import lombok.Data;
import java.util.Date;

@Data
public class Subnav {

    /**
     * 二级导航id
     */
    private Integer subId;

    /**
     * 二级导航名字
     */
    private String subName;

    /**
     * 一级导航id
     */
    private Integer navId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
