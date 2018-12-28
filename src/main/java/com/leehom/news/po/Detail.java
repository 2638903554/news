package com.leehom.news.po;

import lombok.Data;
import java.util.Date;

@Data
public class Detail {

    private Integer detailId;

    private String detailName;

    private Integer newsId;

    private Date createTime;

    private Date updateTime;

}
