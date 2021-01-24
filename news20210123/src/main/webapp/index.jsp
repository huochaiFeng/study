<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/23
  Time: 0:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>无标题文档</title>
    <link type="text/css" rel="stylesheet" href="css/common.css"/>
</head>

<body>
<!--页面顶部-->
<div id="header">
    <div class="main-top">
        <div class="logo"><a href=""><span>新闻大视野</span></a></div>
        <div class="login-box">
            <form action="loginController.jsp" method="get">
                <label>用户名</label><input type="text" name="uname" />
                <label>密码</label><input type="text" name="upwd" />
                <%--<button>登录</button>--%>
                <input type="submit" value="登录"/>
            </form>
        </div>
        <div class="nav">
            <ul class="clearfix">
                <li><a href="#">首页</a></li>
                <li><a href="#">国内</a></li>
                <li><a href="#">国际</a></li>
                <li><a href="#">娱乐</a></li>
                <li><a href="#">军事</a></li>
            </ul>
        </div>
    </div>
    <!--banner-->
    <div class="main-banner">
        <img src="images/banner.png" />
    </div>
    <!--搜索横框-->
    <div class="search-box">
        <div class="sl">
            <div class="sr clearfix">

                <span class="left-search clearfix">
                    <label>站内搜索</label><input type="text" name="keyword" value="关键词" /><button class="go-btn"></button>
                </span>
                <span class="right-link">
                    <label>快速链接</label><select><option>-----专题选择-----</option></select><button class="go-btn"></button>
                </span>

            </div>
        </div>
    </div>
</div>
<!--d页面主体-->
<div id="content" class="main-content clearfix">
    <!--主体的的左边部分-->
    <div class="main-content-left">
        <!--新闻专题分类-->
        <div class="class-box">
            <div class="class-box-header">
                <span class="fr"><a href="#">更多...</a></span>
                <h3>新闻专题</h3>
            </div>
            <div class="class-box-content">
                <ul>
                    <li><a href="#">国内</a></li>
                    <li><a href="#">国际</a></li>
                    <li><a href="#">娱乐</a></li>
                    <li><a href="#">军事</a></li>
                    <li><a href="#">财经</a></li>
                    <li><a href="#">天气</a></li>
                    <li class="clear-bottom-line"><a href="#">科技</a></li>
                </ul>
            </div>
        </div>
        <!--最新新闻-->
        <div class="left-box">
            <div class="left-box-tbg">
                <div class="left-box-bbg">
                    <div class="left-box-header"><h3><a href="#">最新新闻</a></h3></div>
                    <div class="left-box-content">
                        <ul>
                            <li><a href="#">课工场最靠谱的互联网教育 Java Web从入门到成就！</a></li>
                            <li><a href="#">课工场最靠谱的互联网教育 Java Web从入门到成就！</a></li>
                            <li><a href="#">课工场最靠谱的互联网教育 Java Web从入门到成就！</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <!--最新评论-->
        <div class="left-box">
            <div class="left-box-tbg">
                <div class="left-box-bbg">
                    <div class="left-box-header"><h3>最新评论</h3></div>
                    <div class="left-box-content">
                        <ul>
                            <li><a href="#">课工场最靠谱的互联网教育 Java Web从入门到成就！</a></li>
                            <li><a href="#">课工场最靠谱的互联网教育 Java Web从入门到成就！</a></li>
                            <li><a href="#">课工场最靠谱的互联网教育 Java Web从入门到成就！</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--页面主体的右部，包括新闻的列表和评论内容 -->
    <div class="main-content-right">
        <!--各专题的新闻列表-->
        <div class="main-text-box">
            <div class="main-text-box-tbg">
                <div class="main-text-box-bbg">

                    <div class="main-text-box-header">
                        <h3>即时新闻</h3>
                    </div>
                    <div class="main-text-box-content">
                        <ul class="news-list-ul clearfix">
                            <li><span>2016-4-28 10:33:33</span><a href="#">课工场Java Web，璇女神带你学习</a></li>
                            <li><span>2016-4-28 10:33:33</span><a href="#">课工场UI节日回馈，送线下项目实战课程</a></li>
                            <li><span>2016-4-28 10:33:33</span><a href="#">利用响应式布局搭建自己的个人简介网站</a></li>
                            <li><span>2016-4-28 10:33:33</span><a href="#">网页设计师的福利：可视化操作无需程序</a></li>
                            <li class="li-line"><span>2016-4-28 10:33:33</span><a href="#">提交课工场Bug或者建议，送K币，礼品</a></li>

                            <li><span>2016-4-28 10:33:33</span><a href="#">课工场Java Web，璇女神带你学习</a></li>
                            <li><span>2016-4-28 10:33:33</span><a href="#">课工场UI节日回馈，送线下项目实战课程</a></li>
                            <li><span>2016-4-28 10:33:33</span><a href="#">利用响应式布局搭建自己的个人简介网站</a></li>
                            <li><span>2016-4-28 10:33:33</span><a href="#">网页设计师的福利：可视化操作无需程序</a></li>
                            <li class="li-line"><span>2016-4-28 10:33:33</span><a href="#">提交课工场Bug或者建议，送K币，礼品</a></li>

                            <li><span>2016-4-28 10:33:33</span><a href="#">课工场Java Web，璇女神带你学习</a></li>
                            <li><span>2016-4-28 10:33:33</span><a href="#">课工场UI节日回馈，送线下项目实战课程</a></li>
                            <li><span>2016-4-28 10:33:33</span><a href="#">利用响应式布局搭建自己的个人简介网站</a></li>
                            <li><span>2016-4-28 10:33:33</span><a href="#">网页设计师的福利：可视化操作无需程序</a></li>
                            <li class="li-line"><span>2016-4-28 10:33:33</span><a href="#">提交课工场Bug或者建议，送K币，礼品</a></li>

                            <li><span>2016-4-28 10:33:33</span><a href="#">课工场Java Web，璇女神带你学习</a></li>
                            <li><span>2016-4-28 10:33:33</span><a href="#">课工场UI节日回馈，送线下项目实战课程</a></li>
                            <li><span>2016-4-28 10:33:33</span><a href="#">利用响应式布局搭建自己的个人简介网站</a></li>
                            <li><span>2016-4-28 10:33:33</span><a href="#">网页设计师的福利：可视化操作无需程序</a></li>
                            <li class="li-line"><span>2016-4-28 10:33:33</span><a href="#">提交课工场Bug或者建议，送K币，礼品</a></li>
                        </ul>
                    </div>
                    <!--图片新闻-->
                    <div class="news-pic">
                        <dl>
                            <dt><img src="images/new-1.png" /></dt>
                            <dd>PHP从入门到放弃</dd>
                        </dl>
                        <dl>
                            <dt><img src="images/new-2.png" /></dt>
                            <dd>Java Web从绝望到希望</dd>
                        </dl>
                        <dl>
                            <dt><img src="images/new-3.png" /></dt>
                            <dd>课工场五一回馈</dd>
                        </dl>
                        <dl>
                            <dt><img src="images/new-2.png" /></dt>
                            <dd>Java Web从绝望到希望</dd>
                        </dl>
                    </div>
                    <div class="page-bar">
                        <ul class="page-num-ul clearfix">
                            <li><a href="#">上一页</a><li>
                            <li><a href="#" class="thisclass">1</a><li>
                            <li><a href="#">2</a><li>
                            <li><a href="#">3</a><li>
                            <li><a href="#">4</a><li>
                            <li><a href="#">5</a><li>
                            <li><a href="#">下一页</a><li>
                        </ul>
                        <span class="page-go-form"><label>跳转至</label><input type="text" name="numkey" class="page-key" />页<button type="submit" class="page-btn">GO</button></span>
                    </div>
                </div>
            </div>
        </div>
        <!--合作媒体-->
        <div class="main-text-box">
            <div class="main-text-box-tbg">
                <div class="main-text-box-bbg">
                    <div class="main-text-box-header">
                        <h3>合作媒体</h3>
                    </div>
                    <div class="main-text-box-content">
                        <ul class="link-text-ul clearfix">
                            <li><a href="#">中国政府网</a></li>
                            <li><a href="#">中国政府网</a></li>
                            <li><a href="#">中国政府网</a></li>
                            <li><a href="#">中国政府网</a></li>
                            <li><a href="#">中国政府网</a></li>
                            <li><a href="#">中国政府网</a></li>
                            <li><a href="#">中国政府网</a></li>
                            <li><a href="#">中国政府网</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--页面底部-->
<div id="footer" class="main-footer-box">
    24小时客户服务热线：010-68988888 常见问题解答 新闻热线：010-627488888<br />
    文明办网文明上网举报电话：010-627488888 举报邮箱：jubao@bj-aptech.com.cn<br />
    Coyright&copy;1999-2007 News China gov,All Right Reserved.<br />
    新闻中心版权所有
</div>
</body></html>
