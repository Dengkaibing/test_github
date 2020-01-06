package cn.hongmao.service;

import java.util.List;

import cn.hongmao.bean.City;

/**
 * 城市业务接口
 * 
 * @author yanlianshan
 *
 */
public interface CityService {
	/**
	 * 根据省份id查找城市
	 * 
	 * @param provincialID 省份id
	 * @return 城市集合
	 */
	public List<City> findCity(Integer provincialID);

	/**
	 * 根据城市名模糊查找城市
	 * 
	 * @param city 城市对象
	 * @return 城市集合
	 */
	public List<City> findCityByName(City city);
}
