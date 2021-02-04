<%@ page import="cn.tedu.news.pojo.Topic" %>
<%@ page import="cn.tedu.news.service.TopicServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/1
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改主题</title>
</head>
<body>
    <%
        //1、获取修改之后的主题信息
        request.setCharacterEncoding("UTF-8");
        String tid=request.getParameter("tid");
        String tname=request.getParameter("tname");
        Topic topic=new Topic();
        topic.settId(Integer.parseInt(tid));
        topic.settName(tname);
        //2、修改主题
        int rows=new TopicServiceImpl().modifyTopic(topic);
        //3、跳转页面
        response.sendRedirect("topic_list.jsp");
    %>
</body>
</html>
