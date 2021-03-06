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

    INSERT_NEWSMAKER_FAIL(13,"添加新闻人物失败"),
    DELETE_NEWSMAKER_FAIL(14,"删除新闻人物失败"),
    SELECT_NEWSMAKER_FAIL(15,"查找新闻人物失败"),
    UPDATE_NEWSMAKER_FAIL(16,"更新新闻人物失败"),

    USER_NAME_EXIST(17,"账号已存在"),
    USER_PHONE_EXIST(18,"手机号码已经存在"),
    USER_REGISTER_FAIL(19,"用户注册失败"),
    USER_NAME_EMPTY(20,"该用户不存在"),
    USER_PASS_ERROR(21,"用户密码错误"),
    LOGIN_ERROR(22,"用户登录失败"),

    NAV_ID_ERROR(17,"二级导航中的navid错误"),

    NEWS_NOT_EMPTY(18,"该二级导航下的文章不为空"),

    USER_ID_ERROR(19,"用户id错误"),

    MANAGER_PARAM_ERROR(20,"管理员登录参数错误")






    ;


    private Integer code;
    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
