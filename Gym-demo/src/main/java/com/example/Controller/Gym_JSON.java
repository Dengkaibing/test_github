package com.example.Controller;

import com.example.Iml.*;
import com.example.entity.*;
import com.example.respository.LoginrecordMapper;
import com.example.respository.StocklistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping(value = "JSON")
public class Gym_JSON {
    @Autowired
    private MemberIml memberIml;
    @Autowired
    private MembertypeIml membertypeIml;
    @Autowired
    private MemberrechargeIml memberrechargeIml;
    @Autowired
    private ProductIml productIml;
    @Autowired
    private ServiceIml serviceIml;
    @Autowired
    private AppointmentIml appointmentIml;
    @Autowired
    private ConsumeIml consumeIml;
    @Autowired
    private WarehouseIml warehouseIml;
    @Autowired
    private StocklistIml stocklistIml;
    @Autowired
    private EmployeesIml employeesIml;
    @Autowired
    private LoginrecordMapper loginrecordMapper;
@RequestMapping(value = "Member",method = RequestMethod.POST)
@ResponseBody
public List<Member> ShowMember()
{ MemberExample memberExample=new MemberExample();
memberExample.setStartRow(0);
memberExample.setPageSize(10);
    List<Member> memberList=memberIml.SelectMember(memberExample);
    return memberList;
}
    @RequestMapping(value = "Delete_Member",method = RequestMethod.POST)
    @ResponseBody
    public int DeleteMember(HttpServletRequest request, HttpServletResponse response)
    {
        int id=Integer.parseInt(request.getParameter("memberId"));
        if(memberIml.DeleteMember(id))
            return 1;
        else
            return 0;
    }
    @RequestMapping(value="Update_Member",method = RequestMethod.POST)
    @ResponseBody
    public int UpdateMember(@RequestBody Member member)
    {
        if(memberIml.UpdateMember(member))
            return 1;
        else
            return 0;
    }
    @RequestMapping(value="Insert_Member",method = RequestMethod.POST)
    @ResponseBody
    public int InsertMember(@RequestBody Member member)
    {   int flag=0;
        List<Member> memberList=memberIml.SelectAllMember();
        System.out.println(member.getMemberIdcard());
        for(Member x:memberList)
            if((x.getMemberId()==member.getMemberId())||(x.getMemberIdcard()==member.getMemberIdcard()))
            {
                flag=0;
                return flag;
            }
        if(memberIml.InsertMember(member))
           flag= 1;
        else
            flag= 0;
        return flag;
    }
    @RequestMapping(value = "Select",method = RequestMethod.POST)
    @ResponseBody
    public List<Member>  SelectMember(HttpServletRequest request, HttpServletResponse response)
    {
        String id=request.getParameter("memberIdcard");
        String memberType=request.getParameter("memberType");
        String Page=request.getParameter("page");
        String counselor=request.getParameter("membercounselor");
        MemberExample memberExample=new MemberExample();
        memberExample.setPageSize(Integer.parseInt(Page));
        memberExample.setStartRow(0);
        MemberExample.Criteria criterion=memberExample.createCriteria();
        if(id!="")
        criterion.andMemberIdcardEqualTo(Integer.parseInt(id));
        if(memberType!="") {

            criterion.andMemberTypeEqualTo(memberType);
        }
        if(counselor!="") {
            criterion.andMemberCounselorEqualTo(counselor);
        }
        List<Member> memberList=memberIml.SelectMember(memberExample);
        return memberList;
    }

    @RequestMapping(value = "memberCounselor",method = RequestMethod.POST)
    @ResponseBody
    public List<String> selectCounsoleor()
    {
        List<String> stringList=memberIml.selectmemberCounselor();;
        return  stringList;
    }
    @ResponseBody
    @RequestMapping (value = "Page",method = RequestMethod.POST)
    public List<Member>  PageMember(HttpServletRequest request,HttpServletResponse response)
    {
        int page=Integer.parseInt(request.getParameter("page"));
        int size=Integer.parseInt(request.getParameter("size"));
        System.out.println(size+"****");
        System.out.println(page);
        MemberExample memberExample=new MemberExample();
        memberExample.setStartRow((page-1)*size);
        memberExample.setPageSize(size);
        List<Member> memberList=memberIml.SelectMember(memberExample);
        return memberList;
    }
    //*****************************************************************会员类型//
    @RequestMapping(value = "memberType",method = RequestMethod.POST)
    @ResponseBody
    public List<Membertype>  SelectAllMembertype()
    {
         List<Membertype> membertypeList=membertypeIml.SelectAllMemberType();
        System.out.println(membertypeList.size());
            return membertypeList;
    }
    @RequestMapping(value = "Delete_memberType",method = RequestMethod.POST)
    @ResponseBody
    public int DeleteMemberrType(HttpServletRequest request,HttpServletResponse response)
    {
        String typeName=request.getParameter("typeName");
        if(membertypeIml.DeleteMemberType(typeName))
            return 1;
        else
            return 0;
    }
    @RequestMapping(value = "Update_memberType",method = RequestMethod.POST)
    @ResponseBody
    public int UpdateMemberType(@RequestBody Membertype membertype)
    {
        if(membertypeIml.UpdateMemberType(membertype))
            return 1;
        else
            return 0;
    }
    @RequestMapping(value = "Insert_memberType",method = RequestMethod.POST)
    @ResponseBody
    public int InsertMemberType(@RequestBody Membertype membertype)
    {
          List<Membertype> membertypeList=membertypeIml.SelectAllMemberType();
           for(Membertype x:membertypeList)
               if(x.getTypeName().equals(membertype.getTypeName()))
               {
                  int i=0;
                   return i;
               }
           if(membertypeIml.InsertMemberType(membertype))
               return 1;
           else
               return 0;
    }
    @ResponseBody
    @RequestMapping(value = "SelectmemberType",method = RequestMethod.POST)
    public List<Membertype> SelectmemberType(HttpServletRequest request,HttpServletResponse response)
    {
        String typeName=request.getParameter("typeName");
        MembertypeExample membertypeExample=new MembertypeExample();
        membertypeExample.createCriteria().andTypeNameEqualTo(typeName);
        List<Membertype> list=membertypeIml.SelectMemberType(membertypeExample);
        return list;
    }
    @RequestMapping(value="typePage",method = RequestMethod.POST)
    @ResponseBody
    public List<Membertype> PagmemberType(HttpServletRequest request)
    {
        int  page=Integer.parseInt(request.getParameter("page"));
        MembertypeExample membertypeExample =new MembertypeExample();
      membertypeExample.setStartRow((page-1)*10);
      membertypeExample.setPageSize(10);
      List<Membertype> membertypeList=membertypeIml.SelectMemberType(membertypeExample);
      return membertypeList;
    }
    @RequestMapping(value = "memberrecharge",method = RequestMethod.POST)
    @ResponseBody
    public List<Memberrecharge> Selectmemberrecharge()
    {
        List<Memberrecharge> memberrechargeList=memberrechargeIml.SelectAllMemberrecharge();
        return memberrechargeList;
    }
    @RequestMapping(value ="R_member",method = RequestMethod.POST)
    @ResponseBody
    public int R_memberrecharge(@RequestBody Memberrecharge memberrecharge)
    {
        System.out.println(memberrecharge.getMemberIdcard()+"****");
       Member member=memberIml.SelectBykey(memberrecharge.getMemberIdcard());
        System.out.println(member);
       Membertype membertype=membertypeIml.SelectBykey(member.getMemberType());
        member.setCardBalance(member.getCardBalance()+memberrecharge.getRealrecharge()+membertype.getGivenMoney());
        member.setCredit(member.getCredit()+memberrecharge.getRealrecharge());
         memberIml.UpdateMember(member);
        List<Memberrecharge> list=memberrechargeIml.SelectAllMemberrecharge();
        if(list.size()==0)
            memberrecharge.setNumbers(10001);
        else
        memberrecharge.setNumbers(list.get(list.size()-1).getNumbers()+1);
        memberrecharge.setCurrentBlance((int)(member.getCardBalance()+1-1));
        String time=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        System.out.println(time);
        memberrecharge.setRechargeDate(time);
        if(memberrechargeIml.InsertMemberrecharge(memberrecharge))
            return 1;
        else
            return 0;
    }
    @RequestMapping(value = "Product",method = RequestMethod.POST)
    @ResponseBody
    public List<Product> ShowProduct()
    {  ProductExample productExample=new ProductExample();
    productExample.setPageSize(10);
    productExample.setStartRow(0);
        List<Product> productList=productIml.SelectProduct(productExample);
        return productList;
    }
    @RequestMapping(value ="Service",method = RequestMethod.POST)
    @ResponseBody
    public List<Service> ShowService()
    {
        ServiceExample serviceExample=new ServiceExample();
        serviceExample.setPageSize(10);
        serviceExample.setStartRow(0);
        List<Service> serviceList=serviceIml.SelectService(serviceExample);
        return serviceList;
    }
    @RequestMapping(value = "InsertService",method = RequestMethod.POST)
    @ResponseBody
    public int InsertServie(@RequestBody Service service)
    {
          if(serviceIml.InsertService(service))
              return 1;
          else
              return 0;
    }
    @RequestMapping(value ="DeleteService",method = RequestMethod.POST)
    @ResponseBody
    public int DeleteService(HttpServletRequest request,HttpServletResponse response)
    {
       String serviceId=request.getParameter("serviceId");
        if(serviceIml.DeleteService(serviceId))
            return 1;
        else
            return 0;
    }



    @RequestMapping(value = "Appointment",method = RequestMethod.POST)
    @ResponseBody
    public List<Appointment> ShowAppointment()
    {
          AppointmentExample appointmentExample=new AppointmentExample();
          appointmentExample.setStartRow(0);
          appointmentExample.setPageSize(10);
         List<Appointment> appointmentList=appointmentIml.SelecAppointment(appointmentExample);
         return appointmentList;
    }
    @ResponseBody
    @RequestMapping(value = "ServiceType",method = RequestMethod.POST)
    public List<String>  ShowServiceType()
    {
           List<String> stringList=serviceIml.SelectServiceType();
           return stringList;
    }
    @ResponseBody
    @RequestMapping(value = "ServiceName",method = RequestMethod.POST)
    public List<String> ShowServiceName()
    {
        List<String> stringList = serviceIml.SelectServiceName();
        return stringList;
    }
    @RequestMapping(value = "ProductType",method = RequestMethod.POST)
    @ResponseBody
    public List<String> ShowProductType()
    {
        List<String> stringList=productIml.SelectProductType();
        return stringList;
    }
    @RequestMapping(value = "InsertAppointment",method = RequestMethod.POST)
    @ResponseBody
    public boolean InsertAppointment(@RequestBody Appointment appointment)
    {
         List<Appointment> appointmentList=appointmentIml.SelectAllAppointment();
        System.out.println(appointmentList);
           if(appointmentList.size()!=0)
               appointment.setAppointmentId(appointmentList.get(appointmentList.size()-1).getAppointmentId()+1);
           else
               appointment.setAppointmentId(1);
           appointment.setAppointmentDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

           if(appointmentIml.InsertAppointment(appointment))
               return true;
           else
               return false;

    }
    @ResponseBody
    @RequestMapping(value = "Consume",method = RequestMethod.POST)
    public List<Consume>  ShowConsume()
    {
        List<Consume> consumeList=consumeIml.SelectAllConsume();
        return consumeList;
    }
    @ResponseBody
    @RequestMapping(value = "DeleteConsume",method = RequestMethod.POST)
    public int DeleteConsume(HttpServletRequest request,HttpServletResponse response)
    {   int consumeId=Integer.parseInt(request.getParameter("consumeId"));
         if(consumeIml.DeleteConsume(consumeId))
             return 1;
         else
             return 0;
   
    }
    @ResponseBody
    @RequestMapping(value = "Purchase",method = RequestMethod.POST)
    public  int Purchase(@RequestBody Consume consume)
    {
        boolean flag=false;
         consume.setConsumeDate(new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(new Date()));
         List<Consume> list=consumeIml.SelectAllConsume();
         if(list.size()==0)
             consume.setConsumeId(10001);
         else
             consume.setConsumeId(list.get(list.size()-1).getConsumeId()+1);
         consume.setSettleAccounts("是");
         List<Member> memberList=memberIml.SelectAllMember();
         for(Member x:memberList)
         if(x.getMemberName().equals(consume.getMemberName()))
         {
             flag=true;
              x.setCardBalance(x.getCardBalance()-(consume.getPrice()*consume.getNumber()));
              if(x.getCardBalance()<0)
                  return -1;
              memberIml.UpdateMember(x);
             break;
         }
         if(flag&&consumeIml.InsertConsume(consume))
             return 1;
         else
             return 0;
    }
  @RequestMapping(value = "Warehouse",method = RequestMethod.POST)
    @ResponseBody
    public List<Warehouse>  ShowWarehouse()
  {   WarehouseExample warehouseExample=new WarehouseExample();
  warehouseExample.setStartRow(0);
  warehouseExample.setPageSize(10);
       List<Warehouse>  warehouseList=warehouseIml.SelectWarehouse(warehouseExample);
       return warehouseList;
  }
  @ResponseBody
  @RequestMapping(value = "InsertWare",method = RequestMethod.POST)
  public int InsertWare(HttpServletRequest request, HttpServletResponse response)
  {
       int numbers=Integer.parseInt(request.getParameter("numbers"));
       int productId=Integer.parseInt(request.getParameter("productId"));
       Warehouse warehouse=warehouseIml.SelectBykey(productId);
       warehouse.setStockNumber(warehouse.getStockNumber()+numbers);
       String time=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date());
      Stocklist stocklist=new Stocklist();
       List<Stocklist> stocklistList=stocklistIml.SelectAllStocklist();
           if(stocklistList.size()==0)
               stocklist.setStockId("zy924001");
           else
           {
               stocklist.setStockId(stocklistList.get(stocklistList.size()-1).getStockId());
           }
      System.out.println(stocklist.getStockId());
      System.out.println(getNumbers(stocklist.getStockId()));
      int  IntId=Integer.parseInt(getNumbers(stocklist.getStockId()))+1;
           String str=getString(stocklist.getStockId());
      if( warehouseIml.UpdateWarehouse(warehouse)) {
          stocklist.setEmployees("张寒");
          stocklist.setStockDate(time);
          stocklist.setProductId(warehouse.getProductId());
          stocklist.setStockNumbers(numbers);
          stocklist.setProductName(warehouse.getProductName());
          stocklist.setProductType(warehouse.getProductType());
          stocklist.setPurchasePrice(warehouse.getPurchchasingPrice());
          if(stocklistList.size()==0)
              stocklist.setStockId("zy924001");
          else
          stocklist.setStockId(str+IntId);
          stocklistIml.InsertStockList(stocklist);
          return 1;
      }
      else
          return 0;
  }
  @ResponseBody
    @RequestMapping(value = "Stock",method = RequestMethod.POST)
    public List<Stocklist> ShowStocklist()
  {
      StocklistExample stocklistExample=new StocklistExample();
      stocklistExample.setPageSize(10);
      stocklistExample.setStartRow(0);
      List<Stocklist> stocklistList=stocklistIml.SelectStocklist(stocklistExample);
      return stocklistList;
  }
  public static  String getNumbers(String str)
  {
      String rge="\\d*";
      String s1="";
      Pattern p=Pattern.compile(rge);
      Matcher matcher=p.matcher(str);
      while(matcher.find())
      {
          s1=s1+matcher.group();
      }
      return s1;
  }
    public static  String getString(String str) {
        String rge = "\\D*";
        String s1 = "";
        Pattern p = Pattern.compile(rge);
        Matcher matcher = p.matcher(str);
        while (matcher.find()) {
            s1 = s1 + matcher.group();
        }
        return s1;
    }
    @RequestMapping(value = "Employees",method = RequestMethod.POST)
    @ResponseBody
    public List<Employees> ShowEmployees()
    {    EmployeesExample employeesExample=new EmployeesExample();
               employeesExample.setStartRow(0);
               employeesExample.setPageSize(10);
            List<Employees> employeesList=employeesIml.SelectEmployees(employeesExample);
            return employeesList;
    }
    @RequestMapping(value = "EmployeesType",method = RequestMethod.POST)
    @ResponseBody
    public  List<String> ShowEmployeeType() {
        List<String> strings = employeesIml.SelectEmployeeType();
         return strings;
    }
    @RequestMapping(value = "Insert_Employee",method = RequestMethod.POST)
    @ResponseBody
    public int InsertEmployee(@RequestBody Employees employees)
    {
         if(employeesIml.InsertEmployees(employees))
             return 1;
         else
             return 0;

    }
    @ResponseBody
    @RequestMapping(value = "Delete_Employee",method = RequestMethod.POST)
    public int DeleteEmployee(HttpServletRequest request,HttpServletResponse response)
    {
           int employeeId=Integer.parseInt(request.getParameter("employeeId"));
           if(employeesIml.DeleteEmployees(employeeId))
               return 1;
           else
               return 0;
    }
    @ResponseBody
    @RequestMapping(value = "Loginrecord",method = RequestMethod.POST)
    public  List<Loginrecord> SelectLoginrecord()
    {    LoginrecordExample loginrecordExample=new LoginrecordExample();
            List<Loginrecord>  loginrecords=loginrecordMapper.selectByExample(loginrecordExample);
            return loginrecords;
    }

}
