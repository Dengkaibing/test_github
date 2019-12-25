package com.example.demo.Controller;

import com.example.demo.dao.PageRepository;
import com.example.demo.dao.PersonRepository;
import com.example.demo.entity.People;
import com.example.demo.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class DataController {
    public static final Logger logger = LoggerFactory.getLogger(DataController.class);
    @Autowired
    PersonRepository personRepository;
    @Autowired
    PageRepository pageRepository;
    @RequestMapping("/save")
    @ResponseBody
    public  Person save(String name, String address, Integer age) {
        Person p=new Person();
         p = personRepository.save(new Person(13, name, age, address));

        return p;
    }
    @RequestMapping(value = "/q1",produces = "application/json;charset=utf-8")
    @ResponseBody
    public List<Person> qi(){
        List<Person> list=new ArrayList<>() ;
         list=personRepository.findByAddress("hn");
        return list;
    }
    @RequestMapping("/q2")
    @ResponseBody
    public Person q2(String name,String address){
        Person person=personRepository.findByNameAndAddress(name,address);
        logger.debug(person.toString());
        return person;
    }
    @RequestMapping("/q3")
    @ResponseBody
    public Person q3(String name,String address){
        Person person=personRepository.withNameAndAddressQuery(name,address);
        return person;
    }
    @RequestMapping("U1")
    @ResponseBody
    public int u1(){
        int flag=personRepository.updatebyName("dkb");
        return flag;
    }
    @RequestMapping("d1")
    @ResponseBody
    public int d1(){
        int flag=personRepository.deleteByName("dkb");
        return flag;
    }
    @RequestMapping("/sort")
    @ResponseBody
    public  String sort(){
        Iterable<Person> age = pageRepository.findAll(Sort.by("age"));
        Iterator<Person> personIterator=age.iterator();
        while(personIterator.hasNext())
           logger.debug(personIterator.next().toString());
//        Page<Person> pageRepositoryAll = pageRepository.findAll(new com.example.demo.Config.Page(1, 10));
        return  "123";
    }
 }
