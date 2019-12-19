package com.example.Iml;

import com.example.Dao.ConsumeDao;
import com.example.entity.Consume;
import com.example.entity.ConsumeExample;
import com.example.respository.ConsumeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ConsumeIml implements ConsumeDao {
    @Autowired
    private ConsumeMapper consumeMapper;
    @Override
    public List<Consume> SelectAllConsume() {
        ConsumeExample consumeExample=new ConsumeExample();
         List<Consume> consumeList=consumeMapper.selectByExample(consumeExample);
        return consumeList;
    }

    @Override
    public boolean InsertConsume(Consume consume) {
        int i=consumeMapper.insertSelective(consume);

        return i!=0?true:false;
    }

    @Override
    public boolean UpdateConsume(Consume consume) {
        int i=consumeMapper.updateByPrimaryKeySelective(consume);
         return i!=0?true:false;
    }

    @Override
    public boolean DeleteConsume(int ConsumeId) {
        int i=consumeMapper.deleteByPrimaryKey(ConsumeId);
        return i!=0?true:false;
    }

    @Override
    public List<Consume> SelctConsume(ConsumeExample consumeExample) {
        List<Consume> consumeList=consumeMapper.selectByExample(consumeExample);
        return consumeList;
    }

    @Override
    public Consume SelctByket(int ConsumeId) {
        Consume consume=consumeMapper.selectByPrimaryKey(ConsumeId);
        return consume;
    }
}
