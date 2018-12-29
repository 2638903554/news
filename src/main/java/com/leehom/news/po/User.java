package com.leehom.news.po;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户登录账号
     */
    private String userName;

    /**
     * 用户昵称
     */
    private String userNick;

    /**
     * 用户密码
     */
    private String userPass;

    /**
     * 用户手机号码
     */
    private String userPhone;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户投票状态
     */
    private Integer voteStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
