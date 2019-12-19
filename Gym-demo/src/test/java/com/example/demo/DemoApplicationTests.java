package com.example.demo;

import com.example.Iml.MemberIml;
import com.example.Iml.MembertypeIml;
import com.example.Iml.ProductIml;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
   @Autowired
   private MemberIml memberIml;
   @Autowired
   private MembertypeIml membertypeIml;
   @Autowired
   private ProductIml productIml;
    @Test
    public void contextLoads() {
//          List<Member> memberList=memberIml.SelectAllMember();
//          for(Member x:memberList)
//              System.out.println(x);
//          List<String> list=memberIml.selectmemberCounselor();
//        System.out.println(list.size());
//        MemberExample memberExample=new MemberExample();
//        memberExample.createCriteria().andMemberCounselorEqualTo("张洋");
//        List<Member> memberList=memberIml.SelectMember(memberExample);
//        for(Member x:memberList)
//            System.out.println(x);
//        List<Membertype> list=membertypeIml.SelectAllMemberType();
//        System.out.println(list.size());
     List<String> stringList=productIml.SelectProductType();
        System.out.println(stringList);
    }

}
