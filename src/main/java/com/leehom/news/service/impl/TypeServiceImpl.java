package com.leehom.news.service.impl;

import com.leehom.news.dao.DetailDao;
import com.leehom.news.dao.TypeDao;
import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.Detail;
import com.leehom.news.po.Type;
import com.leehom.news.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDao typeDao;

    @Autowired
    private DetailDao detailDao;

    @Override
    public List<Type> selectAll() {
        return typeDao.selectAll();
    }

    @Override
    public Type selectTypeById(Integer typeId) {
        return typeDao.selectTypeById(typeId);
    }

    @Override
    public int updateTypeById(Type type) {
        return typeDao.updateTypeById(type);
    }

    @Override
    public int deleteTypeById(Integer typeId) {
        List<Detail> detailList = detailDao.selectDetailListByTypeId(typeId);
        if(0 != detailList.size()){
            throw new NewsException(ResultEnum.detail_not_null);
        }
        int result = typeDao.deleteTypeById(typeId);
        if(result != 1){
            throw new NewsException(ResultEnum.delete_type_error);
        }
        return result;
    }

    @Override
    public int insertTypeById(Type type) {
        return typeDao.insertTypeById(type);
    }
}
