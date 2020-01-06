package cn.hongmao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hongmao.bean.Province;
import cn.hongmao.mapper.ProvinceMapper;
import cn.hongmao.service.ProvinceService;
@Service("provinceService")
public class ProvinceServiceImpl implements ProvinceService {
	@Resource
	private ProvinceMapper provinceMapper;
	@Override
	public List<Province> findProvince() {
		return provinceMapper.findProvince();
	}
	@Override
	public Province findProvinceById(Integer provincialID) {
		return provinceMapper.findProvinceById(provincialID);
	}

}
