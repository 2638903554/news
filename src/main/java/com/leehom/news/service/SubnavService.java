package com.leehom.news.service;

import com.leehom.news.po.Subnav;

public interface SubnavService {
    Subnav selectByDetailId(Integer detailId);
}
