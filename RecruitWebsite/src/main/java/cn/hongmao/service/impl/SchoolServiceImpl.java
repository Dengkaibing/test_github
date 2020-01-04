package cn.hongmao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hongmao.bean.School;
import cn.hongmao.mapper.SchoolMapper;
import cn.hongmao.service.SchoolService;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {
	@Resource
	private SchoolMapper schoolMapper;

	@Override
	public List<School> findSchool(School school) {
		return schoolMapper.findSchool(school);
	}

}
