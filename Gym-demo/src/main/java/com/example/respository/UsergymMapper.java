package com.example.respository;

import com.example.entity.Usergym;
import com.example.entity.UsergymExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsergymMapper {
    long countByExample(UsergymExample example);

    int deleteByExample(UsergymExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(Usergym record);

    int insertSelective(Usergym record);

    List<Usergym> selectByExample(UsergymExample example);

    Usergym selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") Usergym record, @Param("example") UsergymExample example);

    int updateByExample(@Param("record") Usergym record, @Param("example") UsergymExample example);

    int updateByPrimaryKeySelective(Usergym record);

    int updateByPrimaryKey(Usergym record);
}