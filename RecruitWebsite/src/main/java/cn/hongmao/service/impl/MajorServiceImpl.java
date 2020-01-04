package cn.hongmao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hongmao.bean.Major;
import cn.hongmao.mapper.MajorMapper;
import cn.hongmao.service.MajorService;

@Service("majorService")
public class MajorServiceImpl implements MajorService {
	@Resource
	private MajorMapper majorMapper;

	@Override
	public List<Major> findMajor(Major major) {
		// TODO Auto-generated method stub
		return majorMapper.findMajor(major);
	}

}
