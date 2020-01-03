package com.imaginedragons.believer.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.imaginedragons.believer.entity.Student;
import com.imaginedragons.believer.service.StudentService;

import java.util.List;

public class StudentImpl implements StudentService {

    @Override
    public List<Student> findByNameLike(String name) {
        return null;
    }
}
