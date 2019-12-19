package com.example.respository;

import com.example.entity.Memberrecharge;
import com.example.entity.MemberrechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface MemberrechargeMapper {
    long countByExample(MemberrechargeExample example);

    int deleteByExample(MemberrechargeExample example);

    int deleteByPrimaryKey(Integer numbers);

    int insert(Memberrecharge record);

    int insertSelective(Memberrecharge record);

    List<Memberrecharge> selectByExample(MemberrechargeExample example);

    Memberrecharge selectByPrimaryKey(Integer numbers);

    int updateByExampleSelective(@Param("record") Memberrecharge record, @Param("example") MemberrechargeExample example);

    int updateByExample(@Param("record") Memberrecharge record, @Param("example") MemberrechargeExample example);

    int updateByPrimaryKeySelective(Memberrecharge record);

    int updateByPrimaryKey(Memberrecharge record);
}