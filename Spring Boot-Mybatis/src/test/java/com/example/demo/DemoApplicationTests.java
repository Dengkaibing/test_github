package com.example.demo;

import com.example.demo.entity.Person;
import com.example.demo.entity.PersonExample;
import com.example.demo.repository.PersonMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    public PersonMapper personMapper;

    @Test
    void contextLoads() {
        List<Person> list=personMapper.selectByExample(new PersonExample());
         for(Person x:list)
         {
             System.out.println(x.toString());
         }

    }

}
