package com.imaginedragons.believer;

import com.imaginedragons.believer.Esconfig.ESUtils;
import com.imaginedragons.believer.entity.Student;
import com.imaginedragons.believer.repository.StudentRepository;
import org.assertj.core.util.Lists;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;


import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BelieverApplicationTests {
    @Autowired
    private ESUtils esUtils;
    @Autowired
    private StudentRepository studentRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void creatIndex(){
        esUtils.createIndex(Student.class);
    }
    @Test
    void deleteIndex(){
        esUtils.deleteIndex(Student.class);
    }
    @Test
    void insert()
            {
        Student student=new Student(8,"dkb","男",22,"计算机网络","湖南长沙");
        studentRepository.save(student);
    }
    @Test
    void search(){
        BoolQueryBuilder boolQueryBuilder= QueryBuilders.boolQuery();
        MatchQueryBuilder matchQueryBuilder=QueryBuilders.matchQuery("book","程序设计");
        boolQueryBuilder.must(matchQueryBuilder);
        Iterable<Student> search = studentRepository.search(boolQueryBuilder);
        ArrayList<Student> students = Lists.newArrayList(search);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    void fulltextsearch(){
        List<Student> byNameLike = studentRepository.findByNameLikeOrBookLikeOrAddress("dkb","程序设计","宜章");
        for (Student stydent : byNameLike) {
            System.out.println(stydent);
        }
    }

}
