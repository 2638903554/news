package com.leehom.news.po;

import lombok.Data;
import java.util.Date;

@Data
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
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
