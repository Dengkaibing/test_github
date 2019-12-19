package com.example.respository;

import com.example.entity.Membertype;
import com.example.entity.MembertypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface MembertypeMapper {
    long countByExample(MembertypeExample example);

    int deleteByExample(MembertypeExample example);

    int deleteByPrimaryKey(String typeName);

    int insert(Membertype record);

    int insertSelective(Membertype record);

    List<Membertype> selectByExample(MembertypeExample example);

    Membertype selectByPrimaryKey(String typeName);

    int updateByExampleSelective(@Param("record") Membertype record, @Param("example") MembertypeExample example);

    int updateByExample(@Param("record") Membertype record, @Param("example") MembertypeExample example);

    int updateByPrimaryKeySelective(Membertype record);

    int updateByPrimaryKey(Membertype record);
}