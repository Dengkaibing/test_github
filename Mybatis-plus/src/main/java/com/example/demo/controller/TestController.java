package com.example.demo.controller;

import com.example.demo.config.MyException;
import com.example.demo.entity.Person;
import com.example.demo.entity.TestUser;
import com.example.demo.mapper.TestUserMapper;
import com.example.demo.service.impl.TestUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/json")
    public String hello() throws MyException {
        throw new MyException("发生错误");
    }

}
