package cn.tedu.news.service;

import cn.tedu.news.pojo.New;
import cn.tedu.news.util.PageSupport;

import java.util.*;

/**
 * 新闻服务
 */
public interface NewService {
    //分页服务
    public List<New> pageNew(PageSupport pageSupport);
}
