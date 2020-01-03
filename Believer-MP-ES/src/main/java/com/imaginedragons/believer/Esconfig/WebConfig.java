package com.imaginedragons.believer.Esconfig;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@Configuration
public class WebConfig  extends WebMvcConfigurationSupport {//spring boot 2.0会自动过滤静态资源的请求
    //需要通过WEB配置继承WebMvcConfigurationSupport类 重写下列 方法来放行该请求
    protected void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }
}
