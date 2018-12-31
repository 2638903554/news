package com.leehom.news.service.impl;

import com.leehom.news.dao.SubnavDao;
import com.leehom.news.dto.SubnavDto;
import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.Subnav;
import com.leehom.news.service.SubnavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubnavServiceImpl implements SubnavService {

    @Autowired
    private SubnavDao subnavDao;

    @Override
    public List<Subnav> selectSubnavListByNavId(Integer navId) {
        List<Subnav> subnavList;
        try {
            subnavList = subnavDao.selectSubnavListByNavId(navId);
        }catch (NewsException e){
            throw new NewsException(ResultEnum.NAV_ID_ERROR);
        }
        return subnavList;
    }

    @Override
    public int insertSubnav(Subnav subnav) {
        return subnavDao.insertSubnav(subnav);
    }

    @Override
    public int deleteSubnavById(Integer subnavId) {
        return subnavDao.deleteSubnavById(subnavId);
    }

    @Override
    public Subnav selectBySubnavId(Integer subnavId) {
        return subnavDao.selectBySubnavId(subnavId);
    }

    @Override
    public List<Subnav> selectAll() {
        return subnavDao.selectAll();
    }

    @Override
    public List<SubnavDto> selectSubnavWithNavNameAll() {
        return subnavDao.selectSubnavWithNavNameAll();
    }

    @Override
    public int updateSubnav(Subnav subnav) {
        return subnavDao.updateSubnav(subnav);
    }
}
