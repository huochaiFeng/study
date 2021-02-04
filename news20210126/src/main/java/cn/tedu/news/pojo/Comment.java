package cn.tedu.news.pojo;

import java.util.Date;

public class Comment {
    private int cId;
    private int nId;
    private String cContent;
    private Date cDate;
    private String cIp;
    private String cAuthor;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    public String getcIp() {
        return cIp;
    }

    public void setcIp(String cIp) {
        this.cIp = cIp;
    }

    public String getcAuthor() {
        return cAuthor;
    }

    public void setcAuthor(String cAuthor) {
        this.cAuthor = cAuthor;
    }

    public Comment() {
    }

    public Comment(int cId, int nId, String cContent, Date cDate, String cIp, String cAuthor) {
        this.cId = cId;
        this.nId = nId;
        this.cContent = cContent;
        this.cDate = cDate;
        this.cIp = cIp;
        this.cAuthor = cAuthor;
    }
}
