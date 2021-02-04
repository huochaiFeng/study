package cn.tedu.news.pojo;

/**
 * ���ݿ��е�users��ʵ��
 */
public class User {
    /**
     * ����
     */
    private int uId;
    private String uName;
    private String uPwd;

    /**
     * ���Եķ�װ
     * @return
     */
    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    /**
     * ���캯��
     */
    public User() {
    }

    public User(int uId, String uName, String uPwd) {
        this.uId = uId;
        this.uName = uName;
        this.uPwd = uPwd;
    }
}
