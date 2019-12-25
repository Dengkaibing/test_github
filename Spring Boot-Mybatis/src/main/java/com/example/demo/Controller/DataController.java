package com.example.demo.Controller;

import com.example.demo.entity.Person;
import com.example.demo.entity.PersonExample;
import com.example.demo.repository.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DataController {
    @Autowired
    private PersonMapper personMapper;
    @RequestMapping("list")
    @ResponseBody
    public List<Person> list()
    {
         List<Person> personList=personMapper.selectByExample(new PersonExample());
               return personList;
    }
}
