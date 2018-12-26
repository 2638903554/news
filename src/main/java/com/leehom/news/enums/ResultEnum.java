package com.leehom.news.enums;

import lombok.Getter;

@Getter
public enum ResultEnum implements CodeEnum {

    NEW(0,"新订单");


    private Integer code;
    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
