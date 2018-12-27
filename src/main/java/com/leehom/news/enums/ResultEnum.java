package com.leehom.news.enums;

import lombok.Getter;

@Getter
public enum ResultEnum implements CodeEnum {

    detail_not_null(1,"该一级类别下有二级类别"),
    delete_type_error(2,"删除一级类别失败"),
    ;


    private Integer code;
    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
