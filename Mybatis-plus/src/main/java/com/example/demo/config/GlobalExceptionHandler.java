package com.example.demo.config;

import com.example.demo.entity.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value=MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, MyException e) throws Exception {
            ErrorInfo<String> r = new ErrorInfo<>();
            r.setMessage(e.getMessage());
            r.setCode(ErrorInfo.ERROR);
            r.setData("Some Data");
            r.setUrl(req.getRequestURL().toString());
            return r;
        }

}
