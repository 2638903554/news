package com.leehom.news.service;

import com.leehom.news.dto.SubnavDto;
import com.leehom.news.po.Subnav;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface SubnavService {

    /**
     * 根据navId查询所有Subnav
     * @param navId
     * @return
     */
    List<Subnav> selectSubnavListByNavId(Integer navId);

    /**
     * 添加二级导航
     * @param subnav
     * @return
     */
    int insertSubnav(Subnav subnav);

    /**
     * 根据subnavId删除二级导航
     * @param subnavId
     * @return
     */
    int deleteSubnavById(Integer subnavId);


    /**
     * 根据subnavId查询Subnav
     * @param subnavId
     * @return
     */
    Subnav selectBySubnavId(Integer subnavId);

    /**
     * 查找所有二级导航
     * @return
     */
    List<Subnav> selectAll();

    /**
     * 查找所有二级导航附带所属一级导航名字
     * @return
     */
    List<SubnavDto> selectSubnavWithNavNameAll();

    /**
     * 更新二级导航
     * @param subnav
     * @return
     */
    int updateSubnav(Subnav subnav);

}
