package cn.hongmao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hongmao.bean.City;
import cn.hongmao.mapper.CityMapper;
import cn.hongmao.service.CityService;
@Service("cityService")
public class CityServiceImpl implements CityService {
	@Resource
	private CityMapper cityMapper;
	@Override
	public List<City> findCity(Integer provincialID) {
		return cityMapper.findCity(provincialID);
	}
	@Override
	public List<City> findCityByName(City city) {
		return cityMapper.findCityByName(city);
	}

}
