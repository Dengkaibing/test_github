package cn.hongmao.service;

import java.util.List;

import cn.hongmao.bean.Company;

public interface CompanyService {
	
	public List<Company> searchByName(String name);
	
	public Company searchInfoById(Integer cId);

}
