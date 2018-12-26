package com.leehom.news.dao;

import com.leehom.news.po.Detail;

import java.util.List;

public interface DetailDao {

    List<Detail> selectDetailListByTypeId(Integer typeId);

    Detail selectByDetailId(Integer detailId);

}
