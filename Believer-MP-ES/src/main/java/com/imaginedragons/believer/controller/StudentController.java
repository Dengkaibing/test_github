package com.imaginedragons.believer.controller;


import com.imaginedragons.believer.Esconfig.ESUtils;
import com.imaginedragons.believer.entity.Student;
import com.imaginedragons.believer.repository.StudentRepository;
import com.imaginedragons.believer.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-01-02
 */
@Controller
@RequestMapping("/students")
public class StudentController {
     @Autowired
    private StudentServiceImpl studentService;
     @Autowired
     private  ESUtils esUtils;
     @Autowired
     private StudentRepository studentRepository;
     @RequestMapping("/")
     @ResponseBody
     public List<Student> list(){
          List<Student> list=studentService.list();
          studentRepository.saveAll(list);
         for (Student student : list) {
             System.out.println(student.toString());
         }
         return list;
     }
     @PostMapping("/")
     public String save(@RequestBody Student student){
           studentRepository.save(student);
            studentService.save(student);
            return "success";
     }
     @GetMapping("/{id}")
     @ResponseBody
    public Student get(@PathVariable Integer id)
     {
           return studentService.getById(id);

     }
     @DeleteMapping("/{id}")
     @ResponseBody
    public boolean delete(@PathVariable Integer id){
            return studentService.removeById(id);
     }

     @PutMapping("/{id}")
     @ResponseBody
    public boolean update(@PathVariable Integer id,@RequestBody Student student){
           student.setId(id);
         return  studentService.updateById(student);

     }
}
