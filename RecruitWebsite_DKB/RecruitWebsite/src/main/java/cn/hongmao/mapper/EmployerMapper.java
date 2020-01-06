package cn.hongmao.mapper;

import org.apache.ibatis.annotations.Param;

import cn.hongmao.bean.Employer;
/**
 * 招聘者Mapper接口
 * @author DuanYuyan
 *
 */
public interface EmployerMapper {
	/**
	 * 根据id查找招聘者
	 * @param eId 招聘者id
	 * @return 招聘者对象
	 */
	public Employer findEmployerByEid(@Param("eId") Integer eId);
	
	/**
	 * 根据userid查找招聘者
	 * @param userid 用户id
	 * @return 招聘者对象
	 */
	public Employer findEmployerByUserId(@Param("userId") Integer userId);
	
	/**
	 * 修改招聘者信息
	 * @param employer 招聘者对象
	 * @return 受影响行数
	 */
	public int updateEmployer(@Param("employer")Employer employer);
	
	/**
	 * 新增招聘者
	 * @param employer 招聘者对象
	 * @return 影响行数
	 */
	public int insertEmployer(@Param("employer") Employer employer);
}
