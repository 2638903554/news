package com.leehom.news.vo;

import lombok.Data;

@Data
public class ResultVO<T> {

    private Integer code;

    private String message = "";

    private T data;

}
