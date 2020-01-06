package cn.hongmao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hongmao.bean.Province;

/**
 * 省份mapper接口
 * 
 * @author yanlianshan
 *
 */
public interface ProvinceMapper {
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
	public Province findProvinceById(@Param("provincialID") Integer provincialID);
}
