package com.dao;

import com.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UploadFileDao {
    public static boolean insertUser(User user) throws SQLException {
        ResultSet rs = null ;
        PreparedStatement ptst = null ;
        try{
            Connection conn = new Conn().getConn();
            String sql = "insert into user(userID,userName,userPwd,userType) values (?,?,?,?)";
            ptst = conn.prepareStatement(sql);
            ptst.setString(1, user.getUserID());
            ptst.setString(2,user.getUserName());
            ptst.setString(3,user.getUserPwd());
            ptst.setInt(4,user.getUserType());
            int num = ptst.executeUpdate();
            conn.close();
            if(num ==1){
                return true;
            }else if(num == 0){
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ptst.close();
        }
        return false;
    }
}
