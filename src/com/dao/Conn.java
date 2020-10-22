package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    Connection conn = null ;
    public static final String DBDRIVER = "com.mysql.jdbc.Driver";
    public static final String DBURL="jdbc:mysql://localhost:3306/test_course?useUnicode=true&characterEncoding=utf8";
    public static final String DBUSER="root";
    public static final String DBPASS="root";

    public Connection getConn() throws SQLException {
        try {
            Class.forName(DBDRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        return conn;
    }
}
