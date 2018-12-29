package com.leehom.news.service.impl;

import com.leehom.news.dao.SubnavDao;
import com.leehom.news.dao.NavDao;
import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.Nav;
import com.leehom.news.service.NavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NavServiceImpl implements NavService {

    @Autowired
    private NavDao navDao;

    @Autowired
    private SubnavDao subnavDao;

    @Override
    public int insertNav(Nav nav) {
        return navDao.insertNav(nav);
    }

    @Override
    public int deleteNavById(Integer typeId) {
//        List<Subnav> subnavList = subnavDao.selectDetailListByNavId(typeId);
//        if(0 != subnavList.size()){
//            throw new NewsException(ResultEnum.DETAIL_NOT_NULL);
//        }
//        int result = navDao.deleteTypeById(typeId);
//        if(result != 1){
//            throw new NewsException(ResultEnum.DELETE_TYPE_ERROR);
//        }
//        return result;
        return 1;
    }

    @Override
    public List<Nav> selectAll() {
        return navDao.selectAll();
    }

    @Override
    public Nav selectNavById(Integer navId) {
        return navDao.selectNavById(navId);
    }

    @Override
    public int updateNav(Nav nav) {
        return navDao.updateNav(nav);
    }




}
