package cn.hongmao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hongmao.bean.School;

/**
 * 学校mapper接口
 * 
 * @author asus
 *
 */

public interface SchoolMapper {
	/**
	 * 根据学校名称模糊查找
	 * 
	 * @param school 学校对象
	 * @return 学校集合
	 */
	public List<School> findSchool(@Param("school") School school);
}
