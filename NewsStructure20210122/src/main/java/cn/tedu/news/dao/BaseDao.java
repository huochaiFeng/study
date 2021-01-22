package cn.tedu.news.dao;

import cn.tedu.news.util.ConfigManager;

import java.sql.*;

/**
 * JDBC�ķ�װ��
 */
public class BaseDao {
    /**
     * ����
     */
    private Connection connection;//���Ӷ���
    private Statement statement;//ִ�ж���1
    private PreparedStatement preparedStatement;//ִ�ж���
    private ResultSet resultSet;//�����
    private int rows;//Ӱ����

    /**
     * ��̬�����
     */
    static {
        try {
            //1����������
            Class.forName(ConfigManager.getInstance().getValue("jdbc.driver_class"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //2����ȡ����

    /**
     * ��ȡ����
     * @return true�����ɹ���false����ʧ�ܡ�
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

    //3����ȡִ�ж���
    //4��ִ�в���
    /**
     * ���ݸ��·���
     * @param sql ����ɾ����
     * @return ���ݿ��б����ݵ�Ӱ������
     */
    public int executeUpdate(String sql){
        try {
            statement=connection.createStatement();//��ȡִ�ж���
            rows=statement.executeUpdate(sql);//ʵ�ָ���
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rows;
    }

    /**
     * ���ݿ��ѯ
     * @param sql
     * @return ���ݼ�
     */
    public ResultSet executeQuery(String sql){
        try {
            statement=connection.createStatement();//��ȡִ�ж���
            resultSet=statement.executeQuery(sql);//ִ��sql����ȡ���
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    /**
     * ʵ������ɾ����
     * @param sql
     * @param pars
     * @return
     */
    public int executeUpdate(String sql,Object[] pars){
        try {
            //��ȡִ�ж���
            preparedStatement=connection.prepareStatement(sql);
            //���ò���
            if(pars!=null){
                for (int i = 0; i <pars.length; i++) {
                    preparedStatement.setObject(i+1,pars[i]);
                }
            }
            //ִ�и���
            rows= preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rows;
    }

    /**
     * ִ��sql���
     * @param sql ����ռλ����sql���
     * @param pars �������
     * @return �����
     */
    public ResultSet executeQuery(String sql,Object[] pars){
        try {
            preparedStatement=connection.prepareStatement(sql);
            //���ò���
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
    //5���ͷ���Դ
    /**
     * �ͷ���Դ
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
