package com.leehom.news.po;

import lombok.Data;
import java.util.Date;

@Data
public class News {

    private Integer newsId;
    private String newsTitle;
    private String newsContent;
    private Integer detailId;
    private Date createTime;

}
