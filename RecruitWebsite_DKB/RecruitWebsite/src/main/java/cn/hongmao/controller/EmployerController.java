package cn.hongmao.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hongmao.bean.Company;
import cn.hongmao.bean.Employer;
import cn.hongmao.bean.Job;
import cn.hongmao.bean.UserInfo;
import cn.hongmao.service.CompanyService;
import cn.hongmao.service.EmployerService;
import cn.hongmao.service.JobService;

@Controller
@RequestMapping("/employer")
public class EmployerController {
	@Resource
	private EmployerService employerService;
	@Resource
	private CompanyService companyService;
	@Resource
	private JobService jobService;
	/**
	 * 显示招聘者中心主页
	 * @param session
	 * @param map
	 * @return
	 */
	@GetMapping("/main")
	public String employerShow(HttpSession session,ModelMap map) {
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		Employer employer = employerService.findEmployerByUserId(userInfo.getId());
		map.put("employer", employer);
		return "/employer/main";
	}
	
	/**
	 * 显示发布招聘信息页面
	 * @return
	 */
	@GetMapping("/publishShow")
	public String publishShow() {
		return "/employer/publishRecruitment";
	}
	
	/**
	 * 发布招聘信息
	 * @param job
	 * @param request
	 * @return
	 */
	@PostMapping("/recruit")
	@ResponseBody
	public String publishRecuitment(Job job,HttpServletRequest request,HttpSession session) {
		job.setJName(request.getParameter("jName"));
		job.setJExpression(request.getParameter("jExpression"));
		if(jobService.insertJob(job)>0) {
			Integer jid = jobService.findJid(job);
			String jId = jid.toString();
			job.setJId(jId);
			UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
			Employer employer = employerService.findEmployerByUserId(userInfo.getId());
			job.setCompanyId(employer.getCId());
			job.setPay(request.getParameter("pay"));
			job.setUserId(userInfo.getId());
			job.setUserExpression(request.getParameter("userExpression"));
		}
		jobService.insertContact(job);
		return "发布成功";
	}
		
	/**
	 * 登录成功后检验是否有个人信息，有则进首页，没有则进信息完善页面
	 * 
	 * @param session HttpSession对象，用于获取用户id
	 * @return 对应页面
	 */
	@GetMapping("/insert")
	public String insertInfo(HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		Integer userId = userInfo.getId();
		Employer employer = employerService.findEmployerByUserId(userId);
		if (employer == null) {
			return "/employer/employerInsert";
		} else {
			return "redirect:/index";
		}
	}
	
	/**
	 * 信息完善页面
	 * 
	 * @param employer  Employer对象
	 * @param request HttpServletRequest对象，用于获取前端数据
	 * @return 首页
	 */
	@PostMapping("/insert")
	public String insertInfo(Employer employer, HttpServletRequest request) {
		employer.setEName(request.getParameter("name"));
		employer.setEEmail(request.getParameter("email"));
		String ssex = request.getParameter("sex");
		int sex = 0;
		if(ssex != null && ssex != "") {
			sex = Integer.parseInt(ssex);
		}
		employer.setESex(sex);
		String aage = request.getParameter("age");
		int age = 0;
		if(ssex != null && ssex != "") {
			age = Integer.parseInt(aage);
		}
		employer.setESex(sex);
		employer.setEAge(age);
		employer.setEImage("wo.png");
		HttpSession session = request.getSession();
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		Integer userId = userInfo.getId();
		employer.setUserId(userId);
		//获取输入的公司id
		employer.setCId(3);
		if(employerService.insertEmployer(employer)>0) {
			System.out.println("成功");
		}
		return "redirect:main";
	}
	
	
}
