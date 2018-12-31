package com.leehom.news.dao;

import com.leehom.news.po.Link;
import java.util.List;

public interface LinkDao {

    /**
     * 添加友情链接
     * @param link
     * @return
     */
    int insertLink(Link link);

    /**
     * 根据linkId删除友情链接
     * @param linkId
     * @return
     */
    int deleteLinkById(Integer linkId);

    /**
     * 根据linkId查找友情链接
     * @param linkId
     * @return
     */
    Link selectLinkById(Integer linkId);

    /**
     * 查找所有友情链接
     * @return
     */
    List<Link> selectAll();

    Integer count();

    /**
     * 更新友情链接
     * @param link
     * @return
     */
    int updateLink(Link link);


}
