package com.imaginedragons.believer.controller;

import com.imaginedragons.believer.entity.Student;
import com.imaginedragons.believer.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("select")
    public String select(Model model){
        Iterable<Student> studentRepositoryAll = studentRepository.findAll();
        model.addAttribute("student",studentRepositoryAll);
        return "Main";
    }
    @RequestMapping("test")
    public String test(){
        return "test";
    }
}
