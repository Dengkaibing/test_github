package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.repository")//扫描该包下的类添加注解@Mapper
/**
        * 添加了@Mapper注解之后这个接口在编译时会生成相应的实现类
         * 需要注意的是：这个接口中不可以定义同名的方法，因为会生成相同的id
         * 也就是说这个接口是不支持重载的
         */
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
