package com.example.respository;

import com.example.entity.Stocklist;
import com.example.entity.StocklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StocklistMapper {
    long countByExample(StocklistExample example);

    int deleteByExample(StocklistExample example);

    int deleteByPrimaryKey(String stockId);

    int insert(Stocklist record);

    int insertSelective(Stocklist record);

    List<Stocklist> selectByExample(StocklistExample example);

    Stocklist selectByPrimaryKey(String stockId);

    int updateByExampleSelective(@Param("record") Stocklist record, @Param("example") StocklistExample example);

    int updateByExample(@Param("record") Stocklist record, @Param("example") StocklistExample example);

    int updateByPrimaryKeySelective(Stocklist record);

    int updateByPrimaryKey(Stocklist record);
}