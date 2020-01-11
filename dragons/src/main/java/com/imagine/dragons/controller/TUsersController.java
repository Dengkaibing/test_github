package com.imagine.dragons.controller;


import com.imagine.dragons.Exception.BusinessException;
import com.imagine.dragons.constant.WebConst;
import com.imagine.dragons.entity.TUsers;
import com.imagine.dragons.service.impl.TUsersServiceImpl;
import com.imagine.dragons.util.APIResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
@Controller
@RequestMapping("/users")
public class TUsersController  extends  BaseController{
    private static final Logger logger = LoggerFactory.getLogger(TUsersController.class);
    @Autowired
    private TUsersServiceImpl tUsersService;

    @GetMapping("/")
    @ResponseBody
    public List<TUsers> list() {
        return tUsersService.list();
    }

    @GetMapping("/login")
    public String login() {
        return "admin/login";
    }

    @PostMapping("/login")
    @ResponseBody
    public APIResponse toLogin(HttpServletRequest request, HttpServletResponse response, @RequestParam String username, @RequestParam String pass) {
        System.out.println(username+pass);
        Integer error_count=cache.get("login_error_count");
        try {
            TUsers user = tUsersService.login(username, pass);
            request.getSession().setAttribute(WebConst.LOGIN_SESSION_KEY, user);
        }catch (Exception e){//出现异常及捕获异常
           logger.error(e.getMessage());
           error_count=null==error_count?1:error_count+1;
           if (error_count>3)
               return APIResponse.fail("您密码已经错误超过三次了，请三分钟后再尝试");
            System.out.println("error_count:"+error_count);
            cache.set("login_error_count",error_count,3*60);
            String msg="登录失败";
            if(e instanceof BusinessException)
                msg=e.getMessage();
            else
                logger.error(msg,e);
            return APIResponse.fail(msg);
        }
        return APIResponse.success();
    }

    @RequestMapping("/index")
    public String index() {
        return "admin/index";
    }


}
