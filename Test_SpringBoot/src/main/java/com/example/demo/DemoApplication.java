package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//在springboot入口启动项目后  项目会自动去指定目录扫描配置文件，
//核心注解，主要母的是开启自动配置也就是所谓的约定大于配置
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
