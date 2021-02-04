package cn.tedu.news.dao;

import cn.tedu.news.pojo.User;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ????????
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User getUserByName(String uname) {
        User user=null;
        //1??sql???
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("SELECT ");
        stringBuilder.append("  uid,uname,upwd ");
        stringBuilder.append("FROM ");
        stringBuilder.append("  news_users  ");
        stringBuilder.append("WHERE ");
        stringBuilder.append("  uname='"+uname+"';");
        //2??????????
        getConnection();
        //3????в??
        ResultSet resultSet=executeQuery(stringBuilder.toString());
        //4??????????

        try {
            //??????????????????
            if(resultSet.next()){
                user=new User();
                user.setuId(resultSet.getInt("uid"));
                user.setuName(resultSet.getString("uname"));
                user.setuPwd(resultSet.getString("upwd"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //5????????
        close();
        return user;
    }

    @Override
    public boolean insertUser(User user) {
        boolean flag=false;
        //1??sql???
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("INSERT INTO ");
        stringBuilder.append("  news_users(uid,uname,upwd) ");
        stringBuilder.append("VALUES ");
        stringBuilder.append("  ("+user.getuId()+",'"+
                user.getuName()+"','"+
                user.getuPwd()+"'); ");
        //2??????????
        getConnection();
        //3????в???
        int rows=executeUpdate(stringBuilder.toString());
        //4????????
        close();
        if(rows==1){
            flag =true;
        }
        return flag;
    }

    @Override
    public boolean updatePassword(User user) {
        return false;
    }
}
