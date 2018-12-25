package com.leehom.news.dao;

import com.leehom.news.po.Detail;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DetailDaoTest extends BaseDaoTest {

    @Test
    public void selectDetailListByTypeIdTest() throws Exception {
        SqlSession sqlSession = getSqlSession();
        try{
            DetailDao detailDao = sqlSession.getMapper(DetailDao.class);
            List<Detail> detailList = detailDao.selectDetailListByTypeId(15);
            Assert.assertNotNull(detailList);
            Assert.assertTrue(detailList.size()>0);
        }finally {
            sqlSession.close();
        }
    }

}