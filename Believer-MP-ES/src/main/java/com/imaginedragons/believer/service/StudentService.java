package com.imaginedragons.believer.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.imaginedragons.believer.entity.Student;

import java.util.List;


public interface StudentService {
     List<Student> findByNameLike(String name);
}
