package com.leehom.news.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class WordsDto {

    private String userNick;

    private String headImg;

    private String wordsContent;

    private Integer newsId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
}
