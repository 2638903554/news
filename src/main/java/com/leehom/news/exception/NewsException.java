package com.leehom.news.exception;

import com.leehom.news.enums.ResultEnum;

public class NewsException extends RuntimeException {

    private Integer code;

    public NewsException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public NewsException(Integer code,String message){
        super(message);
        this.code = code;
    }

}
