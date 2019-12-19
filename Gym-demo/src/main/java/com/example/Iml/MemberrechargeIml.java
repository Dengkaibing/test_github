package com.example.Iml;

import com.example.Dao.MemberrechargeDao;
import com.example.entity.Memberrecharge;
import com.example.entity.MemberrechargeExample;
import com.example.respository.MemberrechargeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberrechargeIml implements MemberrechargeDao {
    @Autowired
    private MemberrechargeMapper memberrechargeMapper;
    @Override
    public List<Memberrecharge> SelectAllMemberrecharge() {
        MemberrechargeExample memberrechargeExample=new MemberrechargeExample();
        List<Memberrecharge> list=memberrechargeMapper.selectByExample(memberrechargeExample);
        return list;
    }

    @Override
    public boolean UpdateMemberrecharge(Memberrecharge memeber) {
         int i=memberrechargeMapper.updateByPrimaryKey(memeber);
         return i!=0?true:false;
    }

    @Override
    public boolean DeleteMemberrecharge(int memberId) {
        int i=memberrechargeMapper.deleteByPrimaryKey( memberId);
        return i!=0?true:false;

    }

    @Override
    public List<Memberrecharge> SelectMemberrecharge(MemberrechargeExample memberExample) {
        List<Memberrecharge> list=memberrechargeMapper.selectByExample(memberExample);
        return list;
    }

    @Override
    public boolean InsertMemberrecharge(Memberrecharge member) {
        int i=memberrechargeMapper.insertSelective( member);
        return i!=0?true:false;
    }

    @Override
    public Memberrecharge SelectByKey(int numbers) {
        Memberrecharge memberrecharge=memberrechargeMapper.selectByPrimaryKey(numbers);
        return memberrecharge;
    }
}
