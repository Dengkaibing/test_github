package com.imaginedragons.believer.repository;


import com.imaginedragons.believer.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface StudentRepository extends ElasticsearchRepository<Student,Integer> {
    List<Student> findByNameLikeOrBookLikeOrAddress(String name,String book,String address);
}
