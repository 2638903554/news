package com.leehom.news.dto;
import lombok.Data;
import java.util.Date;

@Data
public class NewsDto {

    private Integer newsId;
    private String newsTitle;
    private String detailName;
    private Date createTime;
}
