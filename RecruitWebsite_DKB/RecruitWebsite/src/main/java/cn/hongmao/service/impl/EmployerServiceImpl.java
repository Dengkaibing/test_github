package cn.hongmao.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hongmao.bean.Employer;
import cn.hongmao.mapper.EmployerMapper;
import cn.hongmao.service.EmployerService;
@Service("EmployerService")
public class EmployerServiceImpl implements EmployerService {

	@Resource
	private EmployerMapper employerMapper;
	
	@Override
	public int updateEmployer(Employer employer) {
		return employerMapper.updateEmployer(employer);
	}

	@Override
	public int insertEmployer(Employer employer) {
		return employerMapper.insertEmployer(employer);
	}

	@Override
	public Employer findEmployerByEid(Integer eId) {
		return employerMapper.findEmployerByEid(eId);
	}

	@Override
	public Employer findEmployerByUserId(Integer userId) {
		return employerMapper.findEmployerByUserId(userId);
	}

}
