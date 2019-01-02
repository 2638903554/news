package com.leehom.news.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> implements Serializable {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg = "";

    /**
     * 返回具体内容
     */
    private T data;

}
