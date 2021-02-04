package cn.tedu.news.service;

import cn.tedu.news.dao.TopicDao;
import cn.tedu.news.dao.TopicDaoImpl;
import cn.tedu.news.pojo.Topic;

import java.util.List;

public class TopicServiceImpl implements TopicService {
    private TopicDao topicDao=new TopicDaoImpl();

    @Override
    public int addTopic(Topic topic) {
        return topicDao.insertTopic(topic);
    }

    @Override
    public int deleteTopic(int tId) {
        return topicDao.deleteTopic(tId);
    }

    @Override
    public int modifyTopic(Topic topic) {
        return topicDao.updateTopic(topic);
    }

    @Override
    public List<Topic> listTopices() {
        return topicDao.listTopices();
    }
}
