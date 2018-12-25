package com.leehom.news.po;

import lombok.Data;

import java.util.Date;

@Data
public class Type {

    private Integer typeId;
    private String typeName;
    private Date creatTime;

}
