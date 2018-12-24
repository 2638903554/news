package com.leehom.news.po;

import lombok.Data;

import java.util.Date;

@Data
public class Manager {

    private Integer managerId;
    private String managerUsername;
    private String managerPassword;
    private String managerNickname;
    private Date createTime;
    private Integer managerMark;

}
