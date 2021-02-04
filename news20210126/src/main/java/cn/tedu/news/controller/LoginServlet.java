package cn.tedu.news.controller;

import cn.tedu.news.pojo.User;
import cn.tedu.news.service.UserService;
import cn.tedu.news.service.UserServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理登录功能Servlet
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        //登录业务控制
        //1、获取请求中提交的参数
        String uname=req.getParameter("uname");
        String upwd=req.getParameter("upwd");
        //2、声明实例化服务对象
        UserService userService=new UserServiceImpl();
        User user=userService.login(uname);
        //3、登录判断
        if(user!=null){
            //用户存在
            if(user.getuPwd().equals(upwd)){
                //保存用户信息
                req.getSession().setAttribute("currentUser",user);
                //密码正确,重定向
                resp.sendRedirect("/newspages/admin.jsp");
            }else {
                //密码错误
                resp.sendRedirect("index.jsp");
            }
        }else {
            //用户不存在
            resp.sendRedirect("index.jsp");
        }
    }
}
