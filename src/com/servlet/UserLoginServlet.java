package com.servlet;

import com.dao.UserDao;
import com.entity.User;

import javax.jws.soap.SOAPBinding;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class UserLoginServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        this.doPost(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String userID = request.getParameter("userID");
        String userPwd = request.getParameter("userPwd");
        int  userType = Integer.parseInt(request.getParameter("userType"));
        User user = new User(userID,null,userPwd,null,0,null,userType);
//        String foward = "success.jsp";
//        request.setAttribute("user",user);
//        RequestDispatcher rd = request.getRequestDispatcher(foward);
//        rd.forward(request,response);
        User user1 = null;
        try {
            user1 = UserDao.CheckUser(user);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if(user1!=null){
            request.setAttribute("user",user1);
            if(userType==0){
                RequestDispatcher rd = request.getRequestDispatcher("stuIndex.jsp");
                rd.forward(request,response);}
            else if(userType==1){
                RequestDispatcher rd = request.getRequestDispatcher("managerIndex.jsp");
                rd.forward(request,response);
            }

        }else{
            RequestDispatcher rd = request.getRequestDispatcher("userLogin.jsp");
        }


    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
