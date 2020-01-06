package cn.hongmao.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hongmao.bean.Interview;
import cn.hongmao.mapper.InterviewMapper;
import cn.hongmao.service.InterviewService;
@Service("InterviewService")
public class InterviewServiceImpl implements InterviewService {
	@Resource
	private InterviewMapper interviewMapper;
	@Override
	public int insert(Interview info) {
		return interviewMapper.insert(info);
	}

}
