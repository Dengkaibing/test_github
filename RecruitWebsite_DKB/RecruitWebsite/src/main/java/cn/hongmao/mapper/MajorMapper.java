package cn.hongmao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hongmao.bean.Major;

/**
 * 专业mapper接口
 * 
 * @author yanlianshan
 *
 */

public interface MajorMapper {
	/**
	 * 根据专业名模糊查找专业
	 * 
	 * @param major 专业对象
	 * @return 专业集合
	 */
	public List<Major> findMajor(@Param("major") Major major);
}
