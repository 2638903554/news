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
    SELECT_LINK_FAIL(7,"查找友情链接失败"),
    UPDATE_LINK_FAIL(8,"更新友情链接失败"),

    INSERT_NAV_FAIL(9,"添加一级导航失败"),
    DELETE_NAV_FAIL(10,"删除一级导航失败"),
    SELECT_NAV_FAIL(11,"查找一级导航失败"),
    UPDATE_NAV_FAIL(12,"更新一级导航失败"),

    ;


    private Integer code;
    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
