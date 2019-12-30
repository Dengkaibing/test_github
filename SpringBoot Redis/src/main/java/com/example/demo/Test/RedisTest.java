package com.example.demo.Test;

import com.example.demo.Redis.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@SpringBootTest

@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTest {
    @Autowired
    private RedisUtils redisUtils;

    @Test
    public  void set(){
        System.out.println(redisUtils.set("first_key","dkb"));
    }
    @Test
    public void get(){
        Object value=new String();
               value =redisUtils.get("first_key");
        System.out.println(value);
    }
    @Test
    public void expire(){
       redisUtils.expire("first_key",20);
        System.out.println(redisUtils.getExpire("first_key"));
    }

}
