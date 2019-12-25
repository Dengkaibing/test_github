package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
//该注解指明这是一个和数据库映射表映射的实体类
@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@NamedQuery(name="Person.withNameAndAddressNameQuery",query = "select  p from Person p where p.name=?1 and address=?2")
public class Person {
    @Id//属性映射为数据库的主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//默认使用主键生成的方式为自增
    private  Integer id;
    private String name;
    private Integer age;
    private String address;

    public Person() {
    }

    public Person(Integer id, String name, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
