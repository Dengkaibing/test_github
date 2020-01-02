package com.imaginedragons.believer.service.impl;

import com.imaginedragons.believer.entity.Student;
import com.imaginedragons.believer.mapper.StudentMapper;
import com.imaginedragons.believer.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-01-02
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
