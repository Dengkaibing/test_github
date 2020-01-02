package com.imaginedragons.believer.service;

import com.imaginedragons.believer.entity.Student;
import org.elasticsearch.client.ElasticsearchClient;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Service;

@Service
public interface StudentRepository  extends ElasticsearchRepository<Student,Integer> {

}
