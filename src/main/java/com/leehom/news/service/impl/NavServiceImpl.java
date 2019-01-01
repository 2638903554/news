package com.leehom.news.service.impl;

import com.leehom.news.dao.SubnavDao;
import com.leehom.news.dao.NavDao;
import com.leehom.news.dto.ArticleDto;
import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.Nav;
import com.leehom.news.po.Subnav;
import com.leehom.news.service.NavService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
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
    public int deleteNavById(Integer navId) {
        List<Subnav> subnavList = subnavDao.selectSubnavListByNavId(navId);
        if(subnavList.size() != 0){
            log.error("[一级导航操作] 该一级导航下有二级导航，{}",subnavList);
            throw new NewsException(ResultEnum.DETAIL_NOT_NULL);
        }
        return navDao.deleteNavById(navId);
    }

    @Override
    public List<ArticleDto> selectAllArticleByNavId(Integer navId) {
        return navDao.selectAllArticleByNavId(navId);
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
