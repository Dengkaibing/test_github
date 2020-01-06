package cn.hongmao.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import cn.hongmao.intercepor.Myintercepor;
@Configuration
public class MyWebConfigurer implements WebMvcConfigurer {
	@Autowired
	private Myintercepor myintercepor;


	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(myintercepor).addPathPatterns("/**").excludePathPatterns("/index","/index.html","/login","/login.html","/register","/register.html",
//				"/Hunter/**","/employer/**","/zhangbin/**","/Zlog/**","/commons.js");
		WebMvcConfigurer.super.addInterceptors(registry);
	}

}
