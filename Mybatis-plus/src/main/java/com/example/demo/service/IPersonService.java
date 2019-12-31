package com.example.demo.service;

import com.example.demo.entity.Person;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-12-26
 */
public interface IPersonService extends IService<Person> {
    public void deleteByage(List listid);
}
