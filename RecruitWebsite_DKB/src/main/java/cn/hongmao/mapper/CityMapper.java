package cn.hongmao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hongmao.bean.City;

/**
 * 城市mapper接口
 * 
 * @author yanlianshan
 *
 */
public interface CityMapper {
	/**
	 * 根据省份id查找城市
	 * 
	 * @param provincialID 省份id
	 * @return 城市集合
	 */
	public List<City> findCity(@Param("provincialID") Integer provincialID);

	/**
	 * 根据城市名模糊查找城市
	 * 
	 * @param city 城市对象
	 * @return 城市集合
	 */
	public List<City> findCityByName(@Param("city") City city);
}
