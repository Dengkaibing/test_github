package cn.hongmao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hongmao.bean.Job;
import cn.hongmao.mapper.JobMapper;
import cn.hongmao.service.JobService;

@Service
public class JobServiceImpl implements JobService {
	
	@Resource
	private JobMapper jobMapper;

	@Override
	public List<Job> findAll(String jName) {
		return jobMapper.findAll(jName);
	}

	@Override
	public Job findByUserJobId(Integer userId, Integer jobId) {
		return jobMapper.findByUserJobId(userId, jobId);
	}

	@Override
	public List<Job> findByJName(Job job) {
		List<Job> list = jobMapper.findByJName(job);
		return list;
	}

	@Override
	public int insertJob(Job job) {
		return jobMapper.insertJob(job);
	}

	@Override
	public int insertContact(Job job) {
		return jobMapper.insertContact(job);
	}

	@Override
	public int findJid(Job job) {
		return jobMapper.findJid(job);
	}

	@Override
	public List<Job> findByCid(Integer cId) {
		return jobMapper.findByCid(cId);
	}


}
