package com.example.demo.controller;


import com.example.demo.entity.Person;
import com.example.demo.service.impl.PersonServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
@RequestMapping("/demo/person")
public class PersonController {
    //进行日志管理
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private PersonServiceImpl personService;

    @RequestMapping("list")
    @ResponseBody
    public List<Person> List() {
        List<Person> list = personService.list();
        logger.info("我在打印日志");
        return list;
    }

    @RequestMapping("save")
    @ResponseBody
    public Person save(String date, String address, int age, String name) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date2 = LocalDate.parse(date, fmt);
        personService.save(new Person(date2, null, address, age, name));
        return personService.getById(10);
    }
    @RequestMapping(value = "save2",method = RequestMethod.POST)
    @ResponseBody
    public Person update(Person person)
    {
        logger.info(person.toString());
        System.out.println(person.toString());
        personService.save(person);
        return personService.getById(15);

    }


}
