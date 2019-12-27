package com.example.demo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.entity.Person;
import com.example.demo.entity.TestUser;
import com.example.demo.mapper.PersonMapper;
import com.example.demo.repository.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDate;
import java.util.*;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PersonMapper personMapper;

    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<TestUser> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);

        userMapper.insert(new TestUser(null, "邓凯", 1, "123@"));
//      TestUser testUser=new TestUser(null,"ch",22,"95338");
//      testUser.toString();
        System.out.println(("----- selectAll method test ------"));
        List<Person> personList = personMapper.selectList(null);
        personList.forEach(System.out::println);
    }

    /**
     * 通过ID主键查询
     */
    @Test
    public void selectByid() {
        Person p2 = new Person( LocalDate.of(2018,12,7), null, "黄沙", 24,"dkb");
        Person p = personMapper.selectById(9);
        System.out.println(p.toString());
    }

    /**
     * 通过多个ID主键查询
     */
    @Test
    public void selectByList() {
        List<Integer> longs = Arrays.asList(8, 9);
        List<Person> users = personMapper.selectBatchIds(longs);
        users.forEach(System.out::println);
    }

    /**
     * 通过Map参数进行查询
     */
    @Test
    public void selectByMap() {
        Map<String, Object> params = new HashMap<>();
        params.put("name", "ch");
        QueryWrapper<Person> personQueryWrapper = new QueryWrapper<>();

        params.put("age", 22);
        List<Person> users = personMapper.selectByMap(params);
        users.forEach(System.out::println);
    }

    /**
     * 名字包含凯并且年龄小于25
     * <p>
     * WHERE name LIKE '%凯%' AND age < 40
     */
    @Test
    public void selectByWrapperOne() {
        //使用查询包装类
        QueryWrapper<Person> wrapper = new QueryWrapper();
        wrapper.like("name", "凯").lt("age", 25);
        List<Person> personList = personMapper.selectList(wrapper);
        personList.forEach(System.out::println);
    }

    /**
     * 名字包含凯并且年龄在20-25之间
     * <p>
     * WHERE name LIKE '%凯%' AND age < 40
     */
    @Test
    public void selectByWrapperTwo() {
        QueryWrapper<Person> wrapper = new QueryWrapper<>();
        wrapper.like("name", "凯").between("age", 20, 24);
        List<Person> personList = personMapper.selectList(wrapper);
        personList.forEach(System.out::println);
    }
    /**
     * 名字为王性
     * 或者年龄大于等于25
     * 按照年龄降序排序，年龄相同按照id升序排序
     * <p>
     * WHERE name LIKE '%' OR age >= 25 ORDER BY age DESC , id ASC
     */
    @Test
    public void selectByWapperThree(){
        QueryWrapper<Person> wrapper=new QueryWrapper<>();
        wrapper.like("name","ch").or().ge("age",20).orderByAsc("age").orderByAsc("id");
        List<Person> personList=personMapper.selectList(wrapper);
        personList.forEach(System.out::println);
    }
    /*
     * like --> %val%
     * likeLeft-->%val
     * likeRight-->val%
     */
    @Test
    public void selectByWapperfour(){
        QueryWrapper<Person> wrapper=new QueryWrapper<>();
        wrapper.like("name","凯");//相当于%凯
        List<Person> personList=personMapper.selectList(wrapper);
        personList.forEach(System.out::println);
    }
    /**
     * 查询王姓
     * 并且年龄小于40或者邮箱不为空
     * <p>
     * WHERE name LIKE '王%' AND ( age < 40 OR email IS NOT NULL )
     */
    @Test
    public void selectByWrapperFive() {
        QueryWrapper<Person> wrapper = Wrappers.query();
        wrapper.likeRight("name", "c").and(er -> er.lt("age", 40).or().isNotNull("date"));//使用lambda
        List<Person> personList = personMapper.selectList(wrapper);
        personList.forEach(System.out::println);
    }
    /**
     * (年龄小于40或者邮箱不为空) 并且名字姓王
     * WHERE ( age < 40 OR email IS NOT NULL ) AND name LIKE '王%'
     */
    @Test
    public void selectByWrapperSeven() {
        QueryWrapper<Person> wrapper = Wrappers.query();
        //nested相当于加个"(  )"
        wrapper.nested(qw -> qw.lt("age", 30).or().isNotNull("date"))
                .likeRight("name", "c");
        List<Person> personList = personMapper.selectList(wrapper);
        personList.forEach(System.out::println);
    }
    @Test
    public void selectByWrapperEight() {
        QueryWrapper<Person> wrapper = Wrappers.query();
        wrapper.lt("age", 30).or().isNotNull("date")
                .likeRight("name", "c");
        List<Person> personList = personMapper.selectList(wrapper);
        personList.forEach(System.out::println);
    }
    /**
     * 查询年龄为22、23、24
     * WHERE age IN (?,?,?)
     */
    @Test
    public void selectByWrapperNine() {
        QueryWrapper<Person> wrapper = Wrappers.query();
        wrapper.in("age", Arrays.asList(22, 23, 24));
        List<Person> users = personMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }
    /**
     * 查询一条数据
     * limit 1
     */
    @Test
    public void selectByWrapperTen() {
        QueryWrapper<Person> wrapper=Wrappers.query();
        wrapper.in("age",Arrays.asList(22,23,24)).last("limit 1");
        List<Person> users = personMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }





}
