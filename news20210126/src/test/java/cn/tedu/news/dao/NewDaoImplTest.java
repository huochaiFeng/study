package cn.tedu.news.dao;

import cn.tedu.news.pojo.New;
import cn.tedu.news.util.PageSupport;

import java.util.*;

public class NewDaoImplTest {
    public static void main(String[] args) {
        //1、初始化查询参数
        PageSupport pageSupport=new PageSupport();
        pageSupport.setPageSize(15);
        pageSupport.setPageIndex(2);
        //2、分页查询
        NewDao newDao=new NewDaoImpl();
        List<New> news=newDao.pageNew(pageSupport);
        //3、遍历显示结果
        for (New n:news) {
            System.out.println(n.getnId());
        }
    }
}
