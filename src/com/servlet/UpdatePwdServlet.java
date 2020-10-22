package com.servlet;

import com.dao.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class UpdatePwdServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        this.doPost(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String userID = request.getParameter("userID");
        String oldPwd = request.getParameter("oldPwd");
        String newPwd = request.getParameter("newPwd");
        System.out.println("000");
        boolean flag = false;
        try {
            flag = UserDao.UpdatePwd(userID,oldPwd,newPwd);
            System.out.println(flag+"after dao....");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if(flag){
            PopAlert(response);
        }else {
            System.out.println(flag+"end.....");
        }
    }
    public void PopAlert(HttpServletResponse response){
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.print("<script>alert('修改密码成功，请重新登录！'); window.location='userLogin.jsp' </script>");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
