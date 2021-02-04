<%@ page import="cn.tedu.news.service.TopicServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/1
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除主题</title>
</head>
<body>
    <%
        //1、获取删除主题的id
        String tId=request.getParameter("tid");
        //2、调用Service实现实现删除
        int rows=new TopicServiceImpl().deleteTopic(Integer.parseInt(tId));
        //3、页面跳转
        response.sendRedirect("topic_list.jsp");
    %>
</body>
</html>
