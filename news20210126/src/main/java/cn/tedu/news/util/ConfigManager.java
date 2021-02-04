package cn.tedu.news.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ��ȡ�����ļ�
 */
public class ConfigManager {
    private static ConfigManager configManager;//����Ψһʵ������
    private Properties properties=new Properties();//���������ļ���Ϣ

    /**
     * �ṩһ��Ψһ��ȡ����ʵ���ķ���
     * @return
     */
    public static ConfigManager getInstance(){
        if(configManager==null){
            configManager=new ConfigManager();
        }
        return configManager;
    }

    /**
     * ˽�л����캯��
     */
    private ConfigManager(){
        String configPath="database.properties";
        InputStream inputStream= ConfigManager.class.getClassLoader().getResourceAsStream(configPath);
        try {
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * ���������ļ�
     * @param key
     * @return
     */
    public String getValue(String key){
        return properties.getProperty(key);
    }
}
