package com.leehom.news.dto;
import lombok.Data;
import java.util.Date;

@Data
public class NewsDto {

    private Integer newsId;
    private String newsTitle;
    private String subnavName;
    private Date updateTime;
    private Date createTime;
}
