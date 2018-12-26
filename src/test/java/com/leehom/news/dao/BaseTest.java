package com.leehom.news.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.Reader;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class BaseTest {
//    private static SqlSessionFactory sqlSessionFactory;
//
//    @BeforeClass
//    public static void init(){
//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-cf.xml");
//            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//            reader.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//
//    public SqlSession getSqlSession(){
//        return sqlSessionFactory.openSession();
//    }
}
