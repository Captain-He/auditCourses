package com.servlet;

import com.dao.UserDao;
import com.entity.User;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class UserRegisterServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        this.doPost(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String userName=request.getParameter("userName");
        String passWord=request.getParameter("passWord");
        String userMail=request.getParameter("userMail");
//        int userType = Integer.parseInt(request.getParameter("userType"));
//        User user = new User(userName,passWord,userMail,userType);
//        boolean flag = false;
//        try {
//            System.out.println("servlet begin....");
//            flag = UserDao.RegisterUser(user);
//            System.out.println("dao over.....");
//            System.out.println(flag);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        if(flag) {
//            PopAlert(response);
//
//
//        }
    }
    public void PopAlert(HttpServletResponse response){
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.print("<script>alert('您已成功注册，请登录账号！'); window.location='userLogin.jsp' </script>");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

