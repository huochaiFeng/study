package cn.tedu.news.dao;

import cn.tedu.news.util.ConfigManager;

import java.sql.*;

/**
 * JDBC的封装类
 */
public class BaseDao {
    /**
     * 属性
     */
    private Connection connection;//连接对象
    private Statement statement;//执行对象1
    private PreparedStatement preparedStatement;//执行对象
    private ResultSet resultSet;//结果集
    private int rows;//影响行

    /**
     * 静态代码块
     */
    static {
        try {
            //1、加载驱动
            Class.forName(ConfigManager.getInstance().getValue("jdbc.driver_class"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //2、获取链接

    /**
     * 获取连接
     * @return true——成功，false——失败。
     */
    public boolean getConnection(){
        boolean flag=false;
        String url= ConfigManager.getInstance().getValue("jdbc.connection.url");
        String username=ConfigManager.getInstance().getValue("jdbc.connection.username");
        String password=ConfigManager.getInstance().getValue("jdbc.connection.password");
        try {
            connection= DriverManager.getConnection(url,username,password);
            flag=true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            flag= false;
        }
        return flag;
    }

    //3、获取执行对象
    //4、执行操作
    /**
     * 数据更新方法
     * @param sql 增、删、改
     * @return 数据库中表数据的影响行数
     */
    public int executeUpdate(String sql){
        try {
            statement=connection.createStatement();//获取执行对象
            rows=statement.executeUpdate(sql);//实现更新
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rows;
    }

    /**
     * 数据库查询
     * @param sql
     * @return 数据集
     */
    public ResultSet executeQuery(String sql){
        try {
            statement=connection.createStatement();//获取执行对象
            resultSet=statement.executeQuery(sql);//执行sql并获取结果
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    /**
     * 实现增、删、改
     * @param sql
     * @param pars
     * @return
     */
    public int executeUpdate(String sql,Object[] pars){
        try {
            //获取执行对象
            preparedStatement=connection.prepareStatement(sql);
            //设置参数
            if(pars!=null){
                for (int i = 0; i <pars.length; i++) {
                    preparedStatement.setObject(i+1,pars[i]);
                }
            }
            //执行更新
            rows= preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rows;
    }

    /**
     * 执行sql语句
     * @param sql 带有占位符的sql语句
     * @param pars 传入参数
     * @return 结果集
     */
    public ResultSet executeQuery(String sql,Object[] pars){
        try {
            preparedStatement=connection.prepareStatement(sql);
            //设置参数
            if(pars!=null){
                for (int i = 0; i <pars.length; i++) {
                    preparedStatement.setObject(i+1,pars[i]);
                }
            }
            resultSet=preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }
    //5、释放资源
    /**
     * 释放资源
     */
    public void close(){
        if(rows!=0){
            rows=0;
        }
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(preparedStatement!=null){
            try {
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
