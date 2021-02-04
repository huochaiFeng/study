<%@ page import="cn.tedu.news.service.UserService" %>
<%@ page import="cn.tedu.news.service.UserServiceImpl" %>
<%@ page import="cn.tedu.news.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/27
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录控制</title>
</head>
<body>
    <%
        //登录业务控制
        //1、获取请求中提交的参数
        String uname=request.getParameter("uname");
        String upwd=request.getParameter("upwd");
        //2、声明实例化服务对象
        UserService userService=new UserServiceImpl();
        User user=userService.login(uname);
        //3、登录判断
        if(user!=null){
            //用户存在
            if(user.getuPwd().equals(upwd)){
                //保存用户信息
                session.setAttribute("currentUser",user);
               //密码正确,重定向
                response.sendRedirect("newspages/admin.jsp?optionType=login");
            }else {
                //密码错误
                response.sendRedirect("index.jsp");
            }
        }else {
            //用户不存在
            response.sendRedirect("index.jsp");
        }
    %>
</body>
</html>
