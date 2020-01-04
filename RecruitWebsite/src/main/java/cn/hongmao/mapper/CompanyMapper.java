package cn.hongmao.mapper;

import java.util.List;

import cn.hongmao.bean.Company;

public interface CompanyMapper {
	
	public List<Company> searchByName(String name);
	
	public Company searchInfoById(Integer cId);

}
