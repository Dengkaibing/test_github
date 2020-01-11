package com.imagine.dragons.constant;

public interface ErrorConstant {
    interface Auth{
         static final String USERNAME_PASSWORD_IS_EMPTY="你输入的账号或密码不能为空，请从新输入！";
         static final String USERNAME_PASSWORD_ERROR="你输入的账号或密码不正确，请从新输入！";
         static  final String NOT_LOGIN="用户未登录";
    }
}
