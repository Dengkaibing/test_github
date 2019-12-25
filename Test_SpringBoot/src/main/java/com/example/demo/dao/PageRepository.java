package com.example.demo.dao;

import com.example.demo.entity.Person;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PageRepository extends PagingAndSortingRepository<Person,Long> {
    @Override
    Iterable<Person> findAll(Sort sort);
}
