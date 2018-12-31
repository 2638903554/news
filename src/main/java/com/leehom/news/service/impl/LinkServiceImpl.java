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
    public int insertLink(Link link) {
        return linkDao.insertLink(link);
    }

    @Override
    public int deleteLinkById(Integer linkId) {
        return linkDao.deleteLinkById(linkId);
    }

    @Override
    public Link selectLinkById(Integer linkId) {
        return linkDao.selectLinkById(linkId);
    }

    @Override
    public List<Link> selectAll() {
        return linkDao.selectAll();
    }

    @Override
    public int updateLink(Link link) {
        return linkDao.updateLink(link);
    }

    @Override
    public Integer countLink() {
        return linkDao.count();
    }
}
