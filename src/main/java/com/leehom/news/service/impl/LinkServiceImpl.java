package com.leehom.news.service.impl;

import com.leehom.news.dao.LinkDao;
import com.leehom.news.po.Link;
import com.leehom.news.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkServiceImpl implements LinkService {

    @Autowired
    private LinkDao linkDao;

    @Override
    public List<Link> selectAll() {
        return linkDao.selectAll();
    }
}
