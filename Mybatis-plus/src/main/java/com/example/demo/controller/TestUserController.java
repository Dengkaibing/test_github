package com.example.demo.controller;


import com.example.demo.entity.TestUser;
import com.example.demo.mapper.TestUserMapper;
import com.example.demo.service.impl.TestUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-12-31
 */
@Controller
@RequestMapping("/users")
public class TestUserController {
    @Autowired
    private TestUserServiceImpl testUserService;

    @GetMapping("/")
    @ResponseBody
    public List<TestUser> List() {
        return testUserService.list();
    }

    @PostMapping("/")
    @ResponseBody
    public String save(@Valid @RequestBody TestUser user) {//@Valid参数限制
        //用来修饰请求信息中JSON对象自动转化为实体类格式
        // 不进行转化的话，可能会出现类型错误，例如你实体类中是DATE,而请求消息中是String类型
        testUserService.save(user);
        return "success";
    }
}
