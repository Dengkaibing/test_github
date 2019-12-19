package com.example.Dao;

import com.example.entity.Consume;
import com.example.entity.ConsumeExample;

import java.util.List;

public interface ConsumeDao  {
    public List<Consume> SelectAllConsume();
    public boolean InsertConsume(Consume consume);
    public boolean UpdateConsume(Consume consume);
    public boolean DeleteConsume(int ConsumeId);
    public List<Consume> SelctConsume(ConsumeExample consumeExample);
    public Consume SelctByket(int ConsumeId);
}
