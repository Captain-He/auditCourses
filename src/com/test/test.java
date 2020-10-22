package com.test;

import com.dao.UploadFileDao;
import com.entity.UploadFile;
import com.entity.User;

import java.sql.SQLException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws SQLException {
        UploadFile up = new UploadFile();
        ArrayList<User> userList = up.getUserList("C:\\Users\\hzc\\Desktop\\学生信息.xlsx");

        for (User user:userList){
            if(UploadFileDao.insertUser(user)){
                System.out.println("成功！！！");
            }
        }
    }
}
