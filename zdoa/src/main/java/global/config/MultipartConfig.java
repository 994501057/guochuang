package global.config;

import java.io.File;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class}) 
public class MultipartConfig {

    /**
     * 文件上传临时路径
     */
    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        String location = System.getProperty("user.dir") + "/data/tmp";
        File tmpFile = new File(location);
        if (!tmpFile.exists()) {
            tmpFile.mkdirs();
        }
        factory.setLocation(location);
        return factory.createMultipartConfig();
    }
    
    @Bean(name = "multipartResolver")  
    public MultipartResolver multipartResolver() {  
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();  
        resolver.setDefaultEncoding("UTF-8");  
        resolver.setResolveLazily(true);//resolveLazily属性启用是为了推迟文件解析，以在在UploadAction中捕获文件大小异常  
        resolver.setMaxInMemorySize(40960);  
        resolver.setMaxUploadSize(5 * 1024 * 1024);//上传文件大小 5M 5*1024*1024  
        return resolver;  
    } 
}
