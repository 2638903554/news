package com.leehom.news.enums;

import lombok.Getter;

@Getter
public enum ResultEnum implements CodeEnum {

    DETAIL_NOT_NULL(1,"该一级类别下有二级类别"),
    DELETE_TYPE_ERROR(2,"删除一级类别失败"),
    DELETE_TYPE_SUCCESS(3,"删除一级类别成功"),
    TYPEID_ERROR(4,"typeId错误"),
    INSERT_TYPE_ERROR(5,"添加一级类别失败"),
    UPDATE_TYPE_ERROR(6,"更新一级类别失败"),

    ;


    private Integer code;
    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
