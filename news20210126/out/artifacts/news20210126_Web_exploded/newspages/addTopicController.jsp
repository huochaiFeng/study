<%@ page import="cn.tedu.news.pojo.Topic" %>
<%@ page import="cn.tedu.news.service.TopicService" %>
<%@ page import="cn.tedu.news.service.TopicServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/28
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加主题</title>
</head>
<body>
    <%
        //1、获取请求信息
        request.setCharacterEncoding("UTF-8");
        String tname=request.getParameter("tname");
        Topic topic=new Topic();
        topic.settName(tname);
        //2、实现插入
        TopicService service=new TopicServiceImpl();
        int rows=service.addTopic(topic);
        //3、判断实现页面跳转
        if(rows==1){
            //重定向到主题列表topic_list.jsp
            response.sendRedirect("topic_list.jsp");
        }else {
            //重定向到添加topic_add.jsp
            response.sendRedirect("topic_add.jsp");
        }
    %>
</body>
</html>
