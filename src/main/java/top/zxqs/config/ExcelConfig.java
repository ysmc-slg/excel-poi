package top.zxqs.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取项目相关配置
 * @Author: zxq
 * @date: 2023-01-06 14:33
 */
@Component
@ConfigurationProperties(prefix = "demo")
public class ExcelConfig {
    /**
     * 上传路径
     */
    private static String profile;

    /**
     * 获取导入上传路径
     */
    public static String getImportPath() {
        return getProfile() + "/import";
    }
    /**
     * 获取下载路径
     */
    public static String getDownloadPath() {
        return getProfile() + "/download/";
    }
    /**
     * 获取上传路径
     */
    public static String getUploadPath() {
        return getProfile() + "/upload";
    }

    public static String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        ExcelConfig.profile = profile;
    }




}
