package cn.tedu.news.service;

import cn.tedu.news.pojo.New;
import cn.tedu.news.util.PageSupport;

import java.io.Serializable;
import java.util.*;

public class NewServiceImplTest {
    public static void main(String[] args) {
        //1、初始化查询参数
        PageSupport pageSupport=new PageSupport();
        pageSupport.setPageSize(15);
        pageSupport.setPageIndex(1);
        //2、分页查询
        NewService service=new NewServiceImpl();
        List<New> news=service.pageNew(pageSupport);
        //3、遍历显示结果
        for (New n:news) {
            System.out.println(n.getnId());
        }
    }
}
