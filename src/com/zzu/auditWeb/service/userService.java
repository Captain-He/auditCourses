package com.zzu.auditWeb.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.zzu.auditWeb.dao.UserDao;
import com.zzu.auditWeb.dao.UserDaoImpl;
import com.zzu.auditWeb.entity.UserInfo;

public class userService {
    UserDao userDao = new UserDaoImpl();

    public boolean checkUser(Connection conn, UserInfo userInfo)
            throws SQLException {
        Boolean status = false;
        try {
            conn.setAutoCommit(false);
            status = userDao.queryUser(conn, userInfo);
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            conn.rollback();
            try {
                conn.setAutoCommit(true);
            } catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        System.out.println(status+"@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        return status;
    }

}