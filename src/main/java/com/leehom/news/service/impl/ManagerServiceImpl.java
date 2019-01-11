package com.leehom.news.service.impl;

import com.leehom.news.dao.ManagerDao;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.Manager;
import com.leehom.news.service.ManagerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerDao managerDao;

    @Override
    public Manager selectManagerByName(String name) {
        return managerDao.selectManagerByName(name);
    }

    @Override
    public boolean managerLogin(Manager manager) {
        boolean flag = false;
        String name = manager.getManagerUser();
        Manager manager1 = managerDao.selectManagerByName(name);
        if(manager1.getManagerPass().equals(manager.getManagerPass())){
            flag = true;
        }

        return flag;
    }

}
