package com.example.demo.Controller;

import com.example.demo.dao.PersonRepository;
import com.example.demo.entity.People;
import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main {
    @Autowired
    public People people;
    @Autowired
    PersonRepository personRepository;
    @Value("${book.author}")
    public String author;
    @Value("${book.name}")
    public String name;

    @RequestMapping("Hello")
    public String index() {
        return "Hello";
    }

    @RequestMapping("test")
    @ResponseBody
    public String Test() {
        return "book name is:" + name + "and the anthor is" + author;
    }

    @RequestMapping("auto_test")
    @ResponseBody
    public String index2() {
        return "name:" + people.getName() + ",age:" + people.getAge();
    }
    @RequestMapping("json")
    @ResponseBody
    public People index3() {
        return new People("12",12);
    }


}


