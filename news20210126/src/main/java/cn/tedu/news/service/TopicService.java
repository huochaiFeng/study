package cn.tedu.news.service;

import cn.tedu.news.pojo.Topic;

import java.util.*;

/**
 * 主题服务接口
 */
public interface TopicService {
    /**
     * 添加主题
     * @param topic
     * @return
     */
    public  int addTopic(Topic topic);

    /**
     * 根据id删除主题
     * @param tId
     * @return
     */
    public int deleteTopic(int tId);

    /**
     * 修改主题
     * @param topic
     * @return
     */
    public int modifyTopic(Topic topic);

    /**
     * 查询所有主题
     * @return
     */
    public List<Topic> listTopices();
}
