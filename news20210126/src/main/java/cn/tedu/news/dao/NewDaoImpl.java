package cn.tedu.news.dao;

import cn.tedu.news.pojo.New;
import cn.tedu.news.util.PageSupport;
import sun.awt.geom.AreaOp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewDaoImpl extends BaseDao implements NewDao{
    @Override
    public List<New> pageNew(PageSupport pageSupport) {
        //1、创建连接
        getConnection();
        //2、查询
        StringBuilder sb=new StringBuilder();
        sb.append("SELECT ");
        sb.append("     `nid`, `ntitle`, `nauthor` ");
        sb.append("FROM  ");
        sb.append("     `newsmanagersystem`.`news`  ");
        sb.append("LIMIT "+
                (pageSupport.getPageIndex()-1)*pageSupport.getPageSize()+
                ", "+pageSupport.getPageSize()+";  ");
        ResultSet rs=executeQuery(sb.toString());
        //3、数据处理
        List<New> news=new ArrayList<>();
        try{
            while (rs.next()){
                New n=new New();
                n.setnId(rs.getInt(1));
                n.setnTitle(rs.getString(2));
                n.setnAuthor(rs.getString(3));
                news.add(n);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }finally {
            close();
        }
        /*查询新闻总记录*/
        pageSupport.setRowsCount(getNewsCount());
        return news;
    }

    /**
     * 查询新闻记录总行数
     * @return
     */
    private int getNewsCount(){
        //1、创建连接
        getConnection();
        //2、查询
        StringBuilder sb=new StringBuilder();
        sb.append("SELECT ");
        sb.append("     COUNT(*) ");
        sb.append("FROM  ");
        sb.append("     `newsmanagersystem`.`news`  ");
        ResultSet rs=executeQuery(sb.toString());
        //3、数据处理
        int rows=0;
        try{
            if (rs.next()){
               rows=rs.getInt(1);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }finally {
            close();
        }
        return rows;
    }
}
