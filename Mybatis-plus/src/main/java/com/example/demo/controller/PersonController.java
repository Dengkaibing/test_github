package com.example.demo.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.Person;
import com.example.demo.service.impl.PersonServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-12-26
 */
@Controller
@RequestMapping("/persons")
@Api(tags = "用户管理")
public class PersonController {
    //进行日志管理
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(PersonController.class);
    @Autowired
    private PersonServiceImpl personService;

    @GetMapping("/")
    @ResponseBody
    @ApiOperation(value = "获取用户列表")
    public List<Person> List() {
        List<Person> list = personService.list();
        return list;
    }

    @PostMapping("/")
    @ResponseBody
    public String save(@RequestBody Person person) {
        //用来修饰请求信息中JSON对象自动转化为实体类格式
        // 不进行转化的话，可能会出现类型错误，例如你实体类中是DATE,而请求消息中是String类型
        personService.save(person);
        return "success";
    }
    @GetMapping("/{id}")
    @ResponseBody//如果不加该注解默认都是寻找页面
    public Person getPerson(Long id){
         return personService.getById(id);

    }
    @PutMapping("/{id}")
    @ResponseBody
    public String putPerson(@PathVariable Long id,@RequestBody Person person)
    {
             Person person1=personService.getById(id);
             person.setId(id.intValue());
             personService.updateById(person);
             return "success";
    }
    @DeleteMapping("/{id}")
    @ResponseBody
    public String deletePerson(@PathVariable Long id){
         personService.removeById(id);
         return "success";
    }
    @DeleteMapping("/batch/{age}")//批量删除
    @ResponseBody
    public String batchDelete(@PathVariable String age){//@PathVariables接受请求路径中占位符的值
        QueryWrapper<Person> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("age",age);
        List<Person> personList=personService.list(queryWrapper);
        List list=new ArrayList();
        for(Person x:personList)
        {
            System.out.println(x.toString());
             list.add(x.getId());
        }
        personService.deleteByage(list);
        return "success";
    }



}
