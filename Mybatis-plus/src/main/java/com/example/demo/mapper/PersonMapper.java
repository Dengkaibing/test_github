package com.example.demo.mapper;

import com.example.demo.entity.Person;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-12-26
 */
@Service
@Mapper
public interface PersonMapper extends BaseMapper<Person> {

}
