package com.zzu.auditWeb.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.zzu.auditWeb.dao.UserDao;
import com.zzu.auditWeb.dao.UserDaoImpl;
import com.zzu.auditWeb.entity.UserInfo;
import com.zzu.auditWeb.util.ConnectionFactory;

public class UserDaoTest {
    public  static void main(String[] args) throws SQLException{
        ConnectionFactory connectionFactory = ConnectionFactory.getInstance();
        Connection conn = connectionFactory.getConnection();

        UserDao userDao = new UserDaoImpl();
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("a");
        userInfo.setPassword("a");
        userInfo.setEmail("a");
        userDao.save(conn,userInfo);

    }
}