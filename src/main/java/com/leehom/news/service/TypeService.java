package com.leehom.news.service;

import com.leehom.news.po.Type;

import java.util.List;

public interface TypeService {
    List<Type> selectAll();

    Type selectTypeById(Integer typeId);

    int updateTypeById(Type type);

    int deleteTypeById(Integer typeId);

    int insertTypeById(Type type);

}
