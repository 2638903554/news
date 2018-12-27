package com.leehom.news.dao;

import com.leehom.news.po.Detail;

import java.util.List;

public interface DetailDao {

    /**
     * 根据typeId查询Detail
     * @param typeId
     * @return
     */
    List<Detail> selectDetailListByTypeId(Integer typeId);

    /**
     * 根据detailId查询Detail
     * @param detailId
     * @return
     */
    Detail selectByDetailId(Integer detailId);



}
