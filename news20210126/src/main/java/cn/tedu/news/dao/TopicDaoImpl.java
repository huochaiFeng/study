package cn.tedu.news.dao;

import cn.tedu.news.pojo.Topic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 实现主题操作
 */
public class TopicDaoImpl extends BaseDao implements TopicDao {
    @Override
    public int insertTopic(Topic topic) {
        //1、创建连接
        getConnection();
        //2、执行插入
        StringBuilder builder=new StringBuilder();
        builder.append("INSERT INTO ");
        builder.append("    `topic`(`tname`) ");
        builder.append("VALUES ");
        builder.append("    ('"+topic.gettName()+"') ");
        int rows=executeUpdate(builder.toString());
        //3、释放资源
        close();
        return rows;
    }

    @Override
    public int deleteTopic(int tId) {
        //1、创建连接
        getConnection();
        //2、实现删除
        StringBuilder builder=new StringBuilder();
        builder.append("DELETE FROM ");
        builder.append("    `topic`  ");
        builder.append("WHERE ");
        builder.append("    tid= "+tId);
        int rows=executeUpdate(builder.toString());
        //3、释放资源
        close();
        return rows;
    }

    @Override
    public int updateTopic(Topic topic) {
        //1、创建连接
        getConnection();
        //2、修改主题
        StringBuilder builder=new StringBuilder();
        builder.append("UPDATE ");
        builder.append("    `topic` ");
        builder.append("SET ");
        builder.append("    `tname`='"+topic.gettName()+"' ");
        builder.append("WHERE  ");
        builder.append("    `tid`= "+topic.gettId());
        int rows= executeUpdate(builder.toString());
        //3、释放资源
        close();
        return rows;
    }

    @Override
    public List<Topic> listTopices() {
        //1、创建连接
        getConnection();
        //2、查询所有主题信息
        StringBuilder builder=new StringBuilder();
        builder.append("SELECT ");
        builder.append("    `tid`,`tname` ");
        builder.append("FROM  ");
        builder.append("    `topic` ");
        ResultSet set=executeQuery(builder.toString());
        //3、数据处理
        List<Topic> list=new ArrayList<>();
        try {
            while (set.next()){
                Topic topic=new Topic();
                topic.settId(set.getInt("tid"));
                topic.settName(set.getString("tname"));
                list.add(topic);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        } finally {
            //4、释放资源
            close();
        }
        return list;
    }
}
