package cn.tedu.news.service;

import cn.tedu.news.dao.UserDao;
import cn.tedu.news.dao.UserDaoImpl;
import cn.tedu.news.pojo.User;

public class UserServiceImpl implements UserService{

    UserDao userDao=new UserDaoImpl();
    @Override
    public User login(String name) {
        return userDao.getUserByName(name);
    }
}
