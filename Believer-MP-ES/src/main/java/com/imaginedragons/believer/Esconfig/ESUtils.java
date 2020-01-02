package com.imaginedragons.believer.Esconfig;

import com.imaginedragons.believer.entity.Student;
import com.imaginedragons.believer.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Component;

@Component
public class ESUtils {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    private StudentRepository studentRepository;
     /*
        创建索引 会通过类的@Document注解来识别
      */
    public void createIndex(Class tClass){
        elasticsearchTemplate.createIndex(tClass);
    }
    public void deleteIndex(Class tClass){
        elasticsearchTemplate.deleteIndex(tClass);
    }
    public void insert(Student student){
        studentRepository.save(student);
    }
}
