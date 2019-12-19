package com.example.Iml;

import com.example.Dao.MemberDao;
import com.example.entity.Member;
import com.example.entity.MemberExample;
import com.example.respository.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberIml implements MemberDao {
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public List<Member> SelectAllMember() {
        List<Member> memberList=memberMapper.selectByExample(new MemberExample());
        return memberList;
    }

    @Override
    public boolean UpdateMember(Member memeber) {
         int i=memberMapper.updateByPrimaryKey(memeber);
         if(i!=0)
             return true;
        else
            return false;
    }

    @Override
    public boolean DeleteMember(int memberId) {
        int i=memberMapper.deleteByPrimaryKey(memberId);
        if(i!=0)
            return true;
        else
            return false;
    }

    @Override
    public List<Member> SelectMember(MemberExample memberExample) {
        List<Member> memberList=memberMapper.selectByExample(memberExample);
        return memberList;
    }

    @Override
    public boolean InsertMember(Member member) {
          int i=memberMapper.insert(member);
          if(i!=0)
              return true;
          else
              return false;
    }

    @Override
    public List<String> selectmemberCounselor() {
        List<String> list=memberMapper.SelectmemberCounselor();
        return list;
    }
    @Override
    public Member SelectBykey(int memberId) {
        Member member=null;
        MemberExample memberExample=new MemberExample();
         memberExample.createCriteria().andMemberIdcardEqualTo(memberId);
           List<Member> memberList=memberMapper.selectByExample(memberExample);
           if(memberList!=null)
               member=memberList.get(0);
        return  member;
    }
}
