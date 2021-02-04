package cn.tedu.news.service;

import cn.tedu.news.dao.NewDao;
import cn.tedu.news.dao.NewDaoImpl;
import cn.tedu.news.pojo.New;
import cn.tedu.news.util.PageSupport;

import java.util.List;

public class NewServiceImpl implements NewService {
    NewDao newDao=new NewDaoImpl();

    @Override
    public List<New> pageNew(PageSupport pageSupport) {
        return newDao.pageNew(pageSupport);
    }
}
