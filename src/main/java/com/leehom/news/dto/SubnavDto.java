package com.leehom.news.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class SubnavDto {
    /**
     * 二级导航id
     */
    private Integer subnavId;

    /**
     * 二级导航名字
     */
    private String subnavName;

    /**
     * 一级导航id
     */
    private String navName;

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
