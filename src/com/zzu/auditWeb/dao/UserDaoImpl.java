package com.zzu.auditWeb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zzu.auditWeb.entity.UserInfo;

public class UserDaoImpl implements UserDao {

  /*  @Override
    public void save(Connection conn, UserAddr userAddr) throws SQLException {
        String saveSql = "insert into useraddr(country,city,userid) values(?,?,?)";
        PreparedStatement ps = conn.prepareCall(saveSql);
        ps.setString(1, userAddr.getCountry());
        ps.setString(2, userAddr.getCity());
        ps.setString(3, userAddr.getUserid());
        ps.execute();
    }

    @Override
    public void update(Connection conn, UserAddr userAddr) throws SQLException {
        String updateSql = "update useraddr set country=?,city=?,userid=? where id=?";
        PreparedStatement ps = conn.prepareStatement(updateSql);
        ps.setString(1, userAddr.getCountry());
        ps.setString(2, userAddr.getCity());
        ps.setString(3, userAddr.getUserid());
        ps.setLong(4, userAddr.getId());
        ps.execute();
    }*/
  @Override
  public void save(Connection conn, UserInfo userInfo) throws SQLException {
      String saveSql = "insert into user(username,password,mail) values(?,?,?)";
      PreparedStatement ps = conn.prepareCall(saveSql);
      ps.setString(1, userInfo.getUsername());
      ps.setString(2, userInfo.getPassword());
      ps.setString(3, userInfo.getEmail());
      ps.execute();
  }
    @Override
    public void delete(Connection conn, long id) throws SQLException {
        String deleteSql = "delete from useraddr where id = ?";
        PreparedStatement ps = conn.prepareStatement(deleteSql);
        ps.setLong(1, id);
        ps.execute();
    }
/*
    @Override
    public UserAddr singalSelect(Connection conn, long id) throws SQLException {
        String selectSql = "select * from useraddr where id = ?";
        PreparedStatement ps = conn.prepareStatement(selectSql);
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        UserAddr userAddr = new UserAddr();
        while (rs.next()) {
            userAddr.setId(id);
            userAddr.setCountry(rs.getString("country"));
            userAddr.setCity(rs.getString("city"));
            userAddr.setUserid(rs.getString("userid"));
        }
        return userAddr;
    }
*/
    @Override
    public boolean queryUser(Connection conn, UserInfo userInfo)
            throws SQLException {
        String sql = "select * from userinfo where username=? and password=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, userInfo.getUsername());
        st.setString(2, userInfo.getPassword());
        ResultSet rst = st.executeQuery();
        if (rst.next())
            return true;
        else {
            return false;
        }
    }
}