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
    public int insertNewsmaker(Newsmaker newsmaker) {
        return newsmakerDao.insertNewsmaker(newsmaker);
    }

    @Override
    public int deleteNewsmakerById(Integer newsmakerId) {
        return newsmakerDao.deleteNewsmakerById(newsmakerId);
    }

    @Override
    public Newsmaker selectNewsmakerById(Integer newsmakerId) {
        return newsmakerDao.selectNewsmakerById(newsmakerId);
    }

    @Override
    public List<Newsmaker> selectAll() {
        return newsmakerDao.selectAll();
    }

    @Override
    public int updateNewsmaker(Newsmaker newsmaker) {
        return newsmakerDao.updateNewsmaker(newsmaker);
    }

    @Override
    public Integer newsmakerCount() {
        return newsmakerDao.newsmakerCount();
    }
}
