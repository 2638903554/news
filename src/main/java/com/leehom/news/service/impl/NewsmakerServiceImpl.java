package com.leehom.news.service.impl;

import com.leehom.news.dao.NewsmakerDao;
import com.leehom.news.po.Newsmaker;
import com.leehom.news.service.NewsmakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsmakerServiceImpl implements NewsmakerService {

    @Autowired
    private NewsmakerDao newsmakerDao;

    @Override
    public List<Newsmaker> selectAll() {
        return newsmakerDao.selectAll();
    }
}
