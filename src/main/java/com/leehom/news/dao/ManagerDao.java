package com.leehom.news.dao;

import com.leehom.news.po.Manager;
import java.util.List;

public interface ManagerDao {

    Manager selectManagerById(Integer managerId);

    Manager selectManagerByName(String name);

    Manager selectManagerByPass(String pass);

    List<Manager> selectAll();

}
