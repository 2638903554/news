package com.leehom.news.dto;

import com.leehom.news.po.News;
import lombok.Data;

@Data
public class NewsDto {

    private News news;
    private String detailName;

}
