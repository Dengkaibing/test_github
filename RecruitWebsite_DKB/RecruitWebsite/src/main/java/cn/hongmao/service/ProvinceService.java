package cn.hongmao.service;

import java.util.List;

import cn.hongmao.bean.Province;

/**
 * 省份业务接口
 * 
 * @author yanlianshan
 *
 */
public interface ProvinceService {
	/**
	 * 查找所有省份
	 * 
	 * @return 省份集合
	 */
	public List<Province> findProvince();

	/**
	 * 根据省份id查找省份
	 * 
	 * @param provincialID 省份id
	 * @return 省份对象
	 */
	public Province findProvinceById(Integer provincialID);
}
