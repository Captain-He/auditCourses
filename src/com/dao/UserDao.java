package com.dao;
import com.entity.User;

import java.sql.*;

public class UserDao {
    public static User CheckUser(User user) throws SQLException {
        ResultSet rs = null ;
        PreparedStatement ptst = null ;
        try{
            User user1 = new User();
            Connection conn = new Conn().getConn();
            String sql = "select * from user where userID=? and userPwd=? and userType=?";
            ptst = conn.prepareStatement(sql);
            ptst.setString(1, user.getUserID());
            ptst.setString(2,user.getUserPwd());
            ptst.setInt(3,user.getUserType());
            rs = ptst.executeQuery();

            while(rs.next()){
                user1.setUserID(rs.getString("userID"));
                user1.setUserName(rs.getString("userName"));
                user1.setUserPwd(rs.getString("userPwd"));
                user1.setUserMajor(rs.getString("userMajor"));
                user1.setUserGrade(rs.getInt("userGrade"));
                user1.setUserClass(rs.getString("userClass"));
                user1.setUserType(rs.getInt("userType"));
            }
            System.out.println(user1.getUserGrade()+"    grade....");
            conn.close();
            return user1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null ;
    }
    public static boolean RegisterUser(User user) throws SQLException {
        ResultSet rs = null ;
        PreparedStatement ptst = null ;
        try{
            Connection conn = new Conn().getConn();
            String sql = "insert into user values (?,?,?,?)";
            ptst = conn.prepareStatement(sql);
            ptst.setString(1, user.getUserName());
            ptst.setString(2,user.getUserPwd());
            ptst.setString(3,user.getUserID());
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
    public static boolean UpdatePwd(String userID,String oldPwd,String newPwd) throws SQLException{
        PreparedStatement ptst = null ;
        try {
            Connection conn = new Conn().getConn();
            String sql = "update user set userPwd=? where userID=? and userPwd=?";
            ptst = conn.prepareStatement(sql);
            ptst.setString(1,newPwd);
            ptst.setString(2,userID);
            ptst.setString(3,oldPwd);
            int num = ptst.executeUpdate();
            conn.close();
            if(num ==1){
                return true;
            }else if(num == 0){
                return false;
            }
        } finally {
            ptst.close();
        }
        return false;
    }
}
