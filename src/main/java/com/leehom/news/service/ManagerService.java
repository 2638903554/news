package com.leehom.news.service;

import com.leehom.news.po.Manager;

public interface ManagerService {

    Manager selectManagerByName(String name);

    boolean managerLogin(Manager manager);

}
