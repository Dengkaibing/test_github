package com.example.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "people")//当实体类使用该注解时,该实体类会自动在配置文件中找到前缀为“people”的属性值并匹配注入
public class People {
    public String name;
    public int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
