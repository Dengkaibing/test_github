package com.example.Controller;

import com.example.Iml.MemberIml;
import com.example.entity.Member;
import com.example.entity.MemberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "Gym")
public class Gym_Controller {
    @Autowired
    private MemberIml memberIml;
    @RequestMapping(value = "Main",method = RequestMethod.GET)
    public String ShowMain(Model model)
    {
        MemberExample memberExample=new MemberExample();
        memberExample.setPageSize(10);
        memberExample.setStartRow(0);
          List<Member> memberList=memberIml.SelectMember(memberExample);
          model.addAttribute("memberList",memberList);
          return "Gym_Main";
    }
}
