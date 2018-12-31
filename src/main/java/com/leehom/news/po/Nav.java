package com.leehom.news.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
//import com.leehom.news.utils.DateToLongSerializer;
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
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateTime;

}
