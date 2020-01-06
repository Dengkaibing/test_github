package cn.hongmao.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hongmao.bean.Company;
import cn.hongmao.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	@Resource
	public CompanyService companyService;
	
	@GetMapping("/home")
	public String home(@RequestParam(name = "cName", required = false, defaultValue = "")String cName, ModelMap map) {
		System.out.println(cName);
		List<Company> list = companyService.searchByName(cName);
		map.put("list",list);
		return "zhangbin/players";
	}
	
	@GetMapping("/info/{cId}")
	public String info(@PathVariable("cId")Integer cId, ModelMap map) {
		Company company = companyService.searchInfoById(cId);
		map.put("info", company);
		return "zhangbin/companyInfo";
	}
	
	@GetMapping("/test")
	@ResponseBody
	public Object mani() {
		Company company = companyService.searchInfoById(1);
		return company;
	}

}
