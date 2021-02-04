package cn.tedu.news.dao;

import cn.tedu.news.pojo.Topic;

public class TopicDaoImplTest {
    public static void main(String[] args) {
        //1、创建主题对象并初始化
        Topic topic=new Topic();
        topic.settName("抗疫");
        //2、声明实例化TopicDaoImpl对象调用插入方法
        TopicDao topicDao=new TopicDaoImpl();
        int rows=topicDao.insertTopic(topic);
        System.out.println("rows:"+rows);
    }
}
