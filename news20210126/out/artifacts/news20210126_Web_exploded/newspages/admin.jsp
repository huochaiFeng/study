<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="cn.tedu.news.pojo.New" %>
<%@ page import="cn.tedu.news.util.PageSupport" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>添加主题--管理后台</title>
<link href="../css/admin.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div id="main">
	   <div>
	    <iframe src="../newspages/console_element/top.html" scrolling="no" frameborder="0" width="947px" height="180px"></iframe>
	  </div> 
	  <div id="opt_list">
	 	<iframe src="../newspages/console_element/left.html" scrolling="no" frameborder="0" width="130px"></iframe>
	  </div>
	  <div id="opt_area"> 
	    <ul class="classlist">
			<%--实例化NewServiceImpl对象--%>
			<jsp:useBean id="newService" class="cn.tedu.news.service.NewServiceImpl">
			</jsp:useBean>
				<%/*分页查询数据*/
					/*1、获取分页信息*/
					Object object=session.getAttribute("newsPage");
					PageSupport newsPage=null;
					if(object==null){
						newsPage=new PageSupport();
						session.setAttribute("newsPage",newsPage);
					}else {
						newsPage=(PageSupport)object;
					}
					/*2、获取用户操作方式*/
					String optionType=request.getParameter("optionType");
					/*3、设置当前页面索引*/
					switch (optionType){
						case "preview":
							int currentPageIndex=newsPage.getPageIndex();
							newsPage.setPageIndex(currentPageIndex-1);
							break;
						case "next":
							currentPageIndex=newsPage.getPageIndex();
							newsPage.setPageIndex(currentPageIndex+1);
							break;
						case "last":
							newsPage.setPageIndex(newsPage.getPagesCount());
							break;
						case "login":
						case "first":
							newsPage.setPageIndex(1);
							break;
					}

					/*4、查询数据*/
					List<New> news=newService.pageNew(newsPage);
					/*5、保存分页状态*/
					session.setAttribute("newsPage",newsPage);
					for (int i = 0; i < news.size(); i++) {
						if(i!=0&&i%5==0){
					%>
					<li class='space'></li>
					<%
						}
					%>
	      <li> <%=news.get(i).getnTitle()%>
			  <span> 作者：<%=news.get(i).getnAuthor()%> &#160;&#160;&#160;&#160;
				  <a href='news_modify.jsp?nid=<%=news.get(i).getnId()%> '>修改</a> &#160;&#160;&#160;&#160;
				  <a href='news_delete.jsp?nid=<%=news.get(i).getnId()%> '>删除</a>
			  </span>
		  </li>
				<%
					}
				%>
	      <p align="right"> 当前页数:[<%=newsPage.getPageIndex()%>/<%=newsPage.getPagesCount()%>]&nbsp;
			  <%
			  	if(newsPage.getPageIndex()!=1)
				{
			  %>
				  <a href="admin.jsp?optionType=first">首页</a>
				  <a href="admin.jsp?optionType=preview">上一页</a>
			  <%}%>
			  <%
			  	if(newsPage.getPageIndex()!=newsPage.getPagesCount()){
			  %>
				  <a href="admin.jsp?optionType=next">下一页</a>
				  <a href="admin.jsp?optionType=last">末页</a>
			  <%}%>
		  </p>
	    </ul>
	  </div>	  
	  <iframe src="console_element/bottom.html" scrolling="no" frameborder="0" width="947px" height="190px"></iframe>
    </div>
</body>
</html>

	