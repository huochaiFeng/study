package cn.tedu.news.pojo;

import java.util.Date;

/**
 * new��ʵ��ӳ����New
 */
public class New {
    private int nId;
    private int tId;
    private String nTitle;
    private String nAuthor;
    private Date nCreateDate;
    private String nPicPath;
    private String nContent;
    private Date nModifyDate;
    private String nSummary;

    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public String getnAuthor() {
        return nAuthor;
    }

    public void setnAuthor(String nAuthor) {
        this.nAuthor = nAuthor;
    }

    public Date getnCreateDate() {
        return nCreateDate;
    }

    public void setnCreateDate(Date nCreateDate) {
        this.nCreateDate = nCreateDate;
    }

    public String getnPicPath() {
        return nPicPath;
    }

    public void setnPicPath(String nPicPath) {
        this.nPicPath = nPicPath;
    }

    public String getnContent() {
        return nContent;
    }

    public void setnContent(String nContent) {
        this.nContent = nContent;
    }

    public Date getnModifyDate() {
        return nModifyDate;
    }

    public void setnModifyDate(Date nModifyDate) {
        this.nModifyDate = nModifyDate;
    }

    public String getnSummary() {
        return nSummary;
    }

    public void setnSummary(String nSummary) {
        this.nSummary = nSummary;
    }

    public New() {
    }

    public New(int nId, int tId, String nTitle, String nAuthor, Date nCreateDate, String nPicPath, String nContent, Date nModifyDate, String nSummary) {
        this.nId = nId;
        this.tId = tId;
        this.nTitle = nTitle;
        this.nAuthor = nAuthor;
        this.nCreateDate = nCreateDate;
        this.nPicPath = nPicPath;
        this.nContent = nContent;
        this.nModifyDate = nModifyDate;
        this.nSummary = nSummary;
    }
}
