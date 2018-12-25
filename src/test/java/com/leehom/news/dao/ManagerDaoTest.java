package com.leehom.news.dao;

import com.leehom.news.po.Manager;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;


@Slf4j
public class ManagerDaoTest extends BaseDaoTest {

    @Test
    public void findManagerByIdTest() throws Exception {
        SqlSession sqlSession = getSqlSession();
        try {
            ManagerDao managerDao = sqlSession.getMapper(ManagerDao.class);
            Manager manager = managerDao.selectManagerById(1);
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void selectAllTest(){
        SqlSession sqlSession = getSqlSession();
        try {
            ManagerDao managerDao = sqlSession.getMapper(ManagerDao.class);
            List<Manager> managerList = managerDao.selectAll();
            Assert.assertTrue(managerList.size() > 0);
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void insertManagerTest(){
        SqlSession sqlSession = getSqlSession();
        try {
            Manager manager = new Manager();
            manager.setManagerUsername("leehom");
            manager.setManagerNickname("李利鸿");
            manager.setManagerPassword("123456");
            ManagerDao managerDao = getSqlSession().getMapper(ManagerDao.class);
            int result = managerDao.insertManager(manager);
            log.info("{}",result);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }


    @Test
    public void deleteManagerTest(){
        SqlSession sqlSession = getSqlSession();
        try {
            ManagerDao managerDao = getSqlSession().getMapper(ManagerDao.class);
            int result = managerDao.deleteManagerById(24);
            log.info("{}",result);

        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    public void updateManagerTest(){
        SqlSession sqlSession = getSqlSession();
        try {
            ManagerDao managerDao = getSqlSession().getMapper(ManagerDao.class);
            Manager manager = new Manager();
            manager.setManagerId(24);
            manager.setManagerPassword("123456");
            manager.setManagerUsername("leehom");
            manager.setManagerNickname("lilihong");
            manager.setManagerMark(0);
            manager.setCreateTime(new Date());
            int result = managerDao.updateManager(manager);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

}