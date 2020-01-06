package cn.hongmao.service;

import org.apache.ibatis.annotations.Param;

import cn.hongmao.bean.JobHunter;

/**
 * 求职方业务接口
 * 
 * @author yanlianshan
 *
 */
public interface JobHunterService {
	/**
	 * 根据id查找求职者
	 * 
	 * @param jId 求职者id
	 * @return 求职者对象
	 */
	public JobHunter findHunter(Integer userId);

	/**
	 * 修改求职者信息
	 * 
	 * @param hunter 求职者对象
	 * @return 影响行数
	 */
	public boolean insertHunter(JobHunter hunter);

	/**
	 * 新增求职者
	 * 
	 * @param hunter 求职者对象
	 * @return 影响行数
	 */
	public boolean updateHunter(JobHunter hunter);

	/**
	 * 根据用户id修改头像(图片)
	 * 
	 * @param userId 用户id
	 * @param image
	 * @return 影响行数
	 */
	public boolean updateImage(Integer userId, String image);
}
