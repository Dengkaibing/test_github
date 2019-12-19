package com.example.Iml;

import com.example.Dao.MemberTypeDao;
import com.example.entity.Membertype;
import com.example.entity.MembertypeExample;
import com.example.respository.MembertypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MembertypeIml implements MemberTypeDao {
    @Autowired
    private MembertypeMapper membertypeMapper;
    @Override
    public List<Membertype> SelectAllMemberType() {
         List<Membertype> membertypeList=membertypeMapper.selectByExample(new MembertypeExample());
        return membertypeList;
    }

    @Override
    public List<Membertype> SelectMemberType(MembertypeExample membertypeExample) {
        List<Membertype> membertypeList=membertypeMapper.selectByExample(membertypeExample);
        return membertypeList;
    }

    @Override
    public boolean UpdateMemberType(Membertype membertype) {
        int i=membertypeMapper.updateByPrimaryKey(membertype);
        return  i!=0?true:false;
    }

    @Override
    public boolean DeleteMemberType(String typeName) {
        int i=membertypeMapper.deleteByPrimaryKey(typeName);
        return  i!=0?true:false;
    }

    @Override
    public boolean InsertMemberType(Membertype membertype) {
        int i=membertypeMapper.insertSelective(membertype);
        return  i!=0?true:false;
    }

    @Override
    public Membertype SelectBykey(String typeName) {
        Membertype membertype=membertypeMapper.selectByPrimaryKey(typeName);
        return membertype;
    }
}
