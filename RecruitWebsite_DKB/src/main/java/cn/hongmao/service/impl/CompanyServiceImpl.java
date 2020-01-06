package cn.hongmao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hongmao.bean.Company;
import cn.hongmao.mapper.CompanyMapper;
import cn.hongmao.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Resource
	private CompanyMapper companyMapper;
	
	@Override
	public List<Company> searchByName(String name) {
		return companyMapper.searchByName(name);
	}

	@Override
	public Company searchInfoById(Integer cId) {
		return companyMapper.searchInfoById(cId);
	}

}
