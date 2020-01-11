package com.imagine.dragons;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.Imagine.dragons.mapper")
public class DragonsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DragonsApplication.class, args);
    }

}
