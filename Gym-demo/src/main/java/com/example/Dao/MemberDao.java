package com.example.Dao;

import com.example.entity.Member;
import com.example.entity.MemberExample;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MemberDao {
    public List<Member> SelectAllMember();
    public boolean UpdateMember(Member memeber);
    public boolean  DeleteMember(int memberId);
    public List<Member>  SelectMember(MemberExample memberExample);
    public boolean  InsertMember(Member member);
    public List<String>  selectmemberCounselor();
    public Member SelectBykey(int memberId);
}
