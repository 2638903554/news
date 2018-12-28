package com.leehom.news.po;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer userId;

    private String userName;

    private String userNick;

    private String userPassword;

    private String userPhone;

    private String userEmail;

    private Date createTime;

    private Date updateTime;

}
