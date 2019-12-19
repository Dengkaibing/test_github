package com.example.respository;

import com.example.entity.Loginrecord;
import com.example.entity.LoginrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginrecordMapper {
    long countByExample(LoginrecordExample example);

    int deleteByExample(LoginrecordExample example);

    int deleteByPrimaryKey(Integer loginId);

    int insert(Loginrecord record);

    int insertSelective(Loginrecord record);

    List<Loginrecord> selectByExample(LoginrecordExample example);

    Loginrecord selectByPrimaryKey(Integer loginId);

    int updateByExampleSelective(@Param("record") Loginrecord record, @Param("example") LoginrecordExample example);

    int updateByExample(@Param("record") Loginrecord record, @Param("example") LoginrecordExample example);

    int updateByPrimaryKeySelective(Loginrecord record);

    int updateByPrimaryKey(Loginrecord record);
}