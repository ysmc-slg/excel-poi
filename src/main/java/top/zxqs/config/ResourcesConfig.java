package top.zxqs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourcesConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /** 映射到本地目录 */
        registry.addResourceHandler("/profile" + "/**")
                .addResourceLocations("file:" + ExcelConfig.getProfile() + "/");

    }
}