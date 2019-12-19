package com.example.Dao;

import com.example.entity.Memberrecharge;
import com.example.entity.MemberrechargeExample;

import java.util.List;

public interface MemberrechargeDao {
    public List<Memberrecharge> SelectAllMemberrecharge();
    public boolean UpdateMemberrecharge(Memberrecharge memeber);
    public boolean  DeleteMemberrecharge(int memberId);
    public List<Memberrecharge>  SelectMemberrecharge(MemberrechargeExample memberExample);
    public boolean  InsertMemberrecharge(Memberrecharge member);
    public Memberrecharge SelectByKey(int memberId);
}
