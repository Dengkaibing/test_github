package cn.hongmao.service;

import cn.hongmao.bean.Employer;

public interface EmployerService {
	/**
	 * 修改招聘者信息
	 * @param employer
	 * @return
	 */
	public int updateEmployer(Employer employer);
	
	/**
	 * 根据id查找招聘者
	 * @param eId 招聘者id
	 * @return 招聘者对象
	 */
	public Employer findEmployerByEid(Integer eId);
	
	/**
	 * 根据userid查找招聘者
	 * @param userid 用户id
	 * @return 招聘者对象
	 */
	public Employer findEmployerByUserId(Integer userId);
	/**
	 * 新增招聘者
	 * @param employer 招聘者对象
	 * @return 影响行数
	 */
	public int insertEmployer(Employer employer);
}
