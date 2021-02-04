package cn.tedu.news.util;

/**
 * 分页支持类
 */
public class PageSupport {
    //总数据行
    private int rowsCount;
    //页面容量，默认15条记录
    private int pageSize=15;
    //当前显示页索引,默认显示第1页
    private int pageIndex=1;
    //总页数,通过数据行除以页面容量
    private int pagesCount;

    public int getRowsCount() {
        return rowsCount;
    }

    public void setRowsCount(int rowsCount) {
        this.rowsCount = rowsCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPagesCount() {
        this.pagesCount=this.rowsCount/this.pageSize+(
                this.rowsCount%this.pageSize!=0?1:0);
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }
}
