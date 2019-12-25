package com.example.demo.dao;

import com.example.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.GeneratedValue;
import javax.transaction.Transactional;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {//继承JpaRepostitory接口，参数为实体类型 和主键类型

    List<Person> findByAddress(String name);//除继承接口的方法外还可以自定义方法 但有一定的命名规则

    Person findByNameAndAddress(String name, String address);
    //如果使用@Param参数来声明参数时 PQL语句中的参数要用：修饰可以不用数字标记
    @Query("select p from Person p where p.name=:name and p.address=:address")
    Person withNameAndAddressQuery(@Param("name") String name, @Param("address") String address);

    Person withNameAndAddressNameQuery(String name, String address);
    //自定义数据库操作语句如更新和删除需加上这两个注解 否则会操作失败
    @Transactional
    @Modifying
    @Query("update Person p set p.age=33 where p.name=?1")//PQL与SQL语句类似更新操作返回值为影响的行参数后要？和数字
    public int updatebyName(String name);
    @Transactional//更新和删除操作必须加上事务处理，否则会有错误
    public int deleteByName(String name);
}
