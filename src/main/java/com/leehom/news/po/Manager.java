package com.leehom.news.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
//import com.leehom.news.utils.DateToLongSerializer;
import lombok.Data;
import java.util.Date;

@Data
public class Manager {

    /**
     * 管理员id
     */
    private Integer managerId;

    /**
     * 管理员登录账号
     */
    private String managerUser;

    /**
     * 管理员密码
     */
    private String managerPass;

    /**
     * 管理员昵称
     */
    private String managerNick;

    /**
     * 管理员状态，默认为0，表示普通管理员，1表示超级管理员
     */
    private Integer managerStatus;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateTime;
}
