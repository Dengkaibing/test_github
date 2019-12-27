package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//（getter,setter,tostirng,equals,hascode）方法
@AllArgsConstructor//所有属性构造器
@NoArgsConstructor//无参构造器
public class TestUser {
    @TableId(type = IdType.AUTO)//设置主键自动递增
    private Long id;
    private String name;
    private Integer age;
    private String email;

}
