package com.leehom.news.dao;

import com.leehom.news.po.Manager;

import java.util.List;

public interface ManagerDao {

    Manager selectManagerById(Integer managerId);

    List<Manager> selectAll();

    int insertManager(Manager manager);

    int updateManager(Manager manager);

    int deleteManagerById(Integer managerId);

}
