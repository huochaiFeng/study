<%@ page language="java" import="java.util.*,java.sql.*,org.jbit.news.entity.*" pageEncoding="utf-8"%>
<%@ page import="cn.tedu.news.pojo.Topic" %>
<%@ page import="cn.tedu.news.service.TopicServiceImpl" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<title>编辑主题--管理后台</title>
   <script type="text/javascript">
		function check(){
			var tname = document.getElementById("tname");
	
			if(tname.value == ""){
				alert("请输入主题名称！！");
				tname.focus();
				return false;m
			}		
			return true;
		}
	</script>
    <link href="../css/admin.css" rel="stylesheet" type="text/css" />
</head>
<body>
  <div id="main">
      <div>
	    <iframe src="console_element/top.html" scrolling="no" frameborder="0" width="947px" height="180px"></iframe>
	  </div> 
      <div id="opt_list">
      	<iframe src="console_element/left.html" scrolling="no" frameborder="0" width="130px"></iframe>
      </div> 
	  <div id="opt_area">
	    <ul class="classlist"> 
			<%
				List<Topic> topics=new TopicServiceImpl().listTopices();
				//获得泛型集合的迭代器
				Iterator<Topic> it=topics.iterator();
				//判断是否有下一个数据
				while (it.hasNext()){
					//读取下一个数据
					Topic topic=it.next();
			%>
			<li> <%=topic.gettName()%>
			    <a href="topic_modify.jsp?tid=<%=topic.gettId()%>&tname=<%=topic.gettName()%>">修改</a>
				<a href="deleteTopicController.jsp?tid=<%=topic.gettId()%>">删除</a>
			</li> 
			<%
				}
			%>
			</ul>
	  </div>
	  <iframe src="console_element/bottom.html" scrolling="no" frameborder="0" width="947px" height="190px"></iframe>
  </div>
</body>
</html>	