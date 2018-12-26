package com.leehom.news.service.impl;

import com.leehom.news.dao.DetailDao;
import com.leehom.news.po.Detail;
import com.leehom.news.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailServiceImpl implements DetailService {

    @Autowired
    private DetailDao detailDao;

    @Override
    public Detail selectByDetailId(Integer detailId) {
        return detailDao.selectByDetailId(38);
    }
}
