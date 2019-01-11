package com.leehom.news.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Link {

    /**
     * 友情链接id
     */
    private Integer linkId;

    /**
     * 友情链接名字
     */
    private String linkName;

    /**
     * 友情链接url
     */
    private String linkUrl;

    /**
     * 新闻网站简介
     */
    private String linkRemark;

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
