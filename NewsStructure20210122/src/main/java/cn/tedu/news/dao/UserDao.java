package cn.tedu.news.dao;

import cn.tedu.news.pojo.User;

/**
 * ʵ��ӿ�
 */
public interface UserDao {
    /**
     * ͨ���û�����ѯ�û���Ϣ
     * @param uname �û���
     * @return �û���Ϣ
     */
    public User getUserByName(String uname);

    /**
     * �����û���Ϣ
     * @param user �û���Ϣ
     * @return �Ƿ�ɹ�
     */
    public boolean insertUser(User user);

    /**
     * �޸��û�����
     * @param user
     * @return
     */
    public boolean updatePassword(User user);
}
