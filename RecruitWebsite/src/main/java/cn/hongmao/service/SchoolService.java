package cn.hongmao.service;

import java.util.List;

import cn.hongmao.bean.School;

/**
 * 学校业务接口
 * 
 * @author yanlianshan
 *
 */
public interface SchoolService {
	/**
	 * 根据学校名称模糊查找
	 * 
	 * @param school 学校对象
	 * @return 学校集合
	 */
	public List<School> findSchool(School school);
}
