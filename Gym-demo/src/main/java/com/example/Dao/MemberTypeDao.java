package com.example.Dao;

import com.example.entity.Membertype;
import com.example.entity.MembertypeExample;

import java.util.List;

public interface MemberTypeDao {
    public List<Membertype> SelectAllMemberType();
    public List<Membertype> SelectMemberType(MembertypeExample membertypeExample);
    public boolean  UpdateMemberType(Membertype membertype);
    public boolean DeleteMemberType(String  typeName);
    public boolean InsertMemberType(Membertype membertype);
    public Membertype SelectBykey(String  typeName);

}
