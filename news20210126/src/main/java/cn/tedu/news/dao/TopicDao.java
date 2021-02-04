package cn.tedu.news.dao;

import cn.tedu.news.pojo.Topic;

import java.util.*;

/**
 * 主题接口
 */
public interface TopicDao {
    /**
     * 插入主题
     * @param topic
     * @return
     */
    public int insertTopic(Topic topic);

    /**
     * 删除主题
     * @param tId
     * @return
     */
    public int deleteTopic(int tId);

    /**
     * 更新主题
     * @param topic
     * @return
     */
    public int updateTopic(Topic topic);

    /**
     * 查询所有主题记录
     * @return
     */
    public List<Topic> listTopices();
}
