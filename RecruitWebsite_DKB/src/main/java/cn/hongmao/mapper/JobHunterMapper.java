package cn.hongmao.mapper;

import org.apache.ibatis.annotations.Param;

import cn.hongmao.bean.JobHunter;

/**
 * 求职方mapper接口
 * 
 * @author yanlianshan
 *
 */
public interface JobHunterMapper {
	/**
	 * 根据id查找求职者
	 * 
	 * @param userId 用户id
	 * @return 求职者对象
	 */
	public JobHunter findHunter(@Param("userId") Integer userId);

	/**
	 * 修改求职者信息
	 * 
	 * @param hunter 求职者对象
	 * @return 影响行数
	 */
	public int updateHunter(@Param("hunter") JobHunter hunter);

	/**
	 * 新增求职者
	 * 
	 * @param hunter 求职者对象
	 * @return 影响行数
	 */
	public int insertHunter(@Param("hunter") JobHunter hunter);

	/**
	 * 根据用户id修改头像(图片)
	 * @param userId 用户id
	 * @param image
	 * @return 影响行数
	 */
	public int updateImage(@Param("userId") Integer userId, @Param("image") String image);
}
