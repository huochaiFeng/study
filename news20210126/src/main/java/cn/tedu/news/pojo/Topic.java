package cn.tedu.news.pojo;

/**
 * ��ʵ��topic
 */
public class Topic {
    /**
     * ����
     */
    private int tId;
    private String tName;
    /**
     * ���Է�װ
     */
    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }
    /**
     * ���캯��
     */
    public Topic() {
    }

    public Topic(int tId, String tName) {
        this.tId = tId;
        this.tName = tName;
    }
}
