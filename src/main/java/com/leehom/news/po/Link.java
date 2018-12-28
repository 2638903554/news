package com.leehom.news.po;

import lombok.Data;
import java.util.Date;

@Data
public class Link {
    private Integer linkId;
    private String linkName;
    private String linkUrl;
    private Date createTime;
    private Date updateTime;

}
