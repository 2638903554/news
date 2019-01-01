package com.leehom.news.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ArticleDto {

    private Integer navId;

    private Integer newsId;

    private String newsTitle;

    private String newsRemark;

    private String newsContent;

    private String subnavName;

    private String navName;

    private Integer newsViews = 0;

    private Integer newsWords = 0;

    @JsonFormat(pattern = "MM-dd HH", timezone = "GMT+8")
    private Date createTime;

}
