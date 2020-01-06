package cn.hongmao.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hongmao.bean.Job;

public interface JobService {

	public List<Job> findAll(String jName);

	public Job findByUserJobId(Integer userId, Integer jobId);

	/**
	 * yanlianshan 根据职位名称模糊职位
	 * 
	 * @param job 职位对象
	 * @return 职位集合
	 */
	public List<Job> findByJName(Job job);
	/**
	 * 插入招聘信息
	 * @param job 职位对象
	 * @return 受影响的行数
	 */
	public int insertJob(@Param("job")Job job);
	/**
	 * 插入职位-公司-发布者 联系表
	 * @param job 职位对象
	 * @return 受影响的行数
	 */
	public int insertContact(@Param("job")Job job);
	/**
	 * 找出职位对象的id
	 * @param job
	 * @return 职位对象的id
	 */
	public int findJid(@Param("job")Job job);
	/**
	 * 根据公司id查出该公司正在招聘的职位
	 * @param cId
	 * @return 查出的职位列表
	 */
	public List<Job> findByCid(@Param("cId")Integer cId);
}
