package cn.hongmao.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hongmao.bean.JobHunter;
import cn.hongmao.mapper.JobHunterMapper;
import cn.hongmao.service.JobHunterService;
@Service("jobHunterService")
public class JobHunterServiceImpl implements JobHunterService {
	@Resource
	private JobHunterMapper hunterMapper;
	@Override
	public JobHunter findHunter(Integer userId) {
		return hunterMapper.findHunter(userId);
	}

	@Override
	public boolean insertHunter(JobHunter hunter) {
		return hunterMapper.insertHunter(hunter) > 0;
	}

	@Override
	public boolean updateHunter(JobHunter hunter) {
		return hunterMapper.updateHunter(hunter) > 0;
	}

	@Override
	public boolean updateImage(Integer userId, String image) {
		// TODO Auto-generated method stub
		return hunterMapper.updateImage(userId, image) > 0;
	}

}
