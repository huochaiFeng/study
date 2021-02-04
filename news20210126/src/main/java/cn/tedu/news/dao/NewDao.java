package cn.tedu.news.dao;

import cn.tedu.news.pojo.New;
import cn.tedu.news.util.PageSupport;

import java.util.*;

/**
 * 新闻接口
 */
public interface NewDao {
    /**
     * 分页查询新闻信息
     * @param pageSupport
     * @return
     */
    public List<New> pageNew(PageSupport pageSupport);
}
