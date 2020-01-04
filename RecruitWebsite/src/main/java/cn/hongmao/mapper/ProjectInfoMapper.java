package cn.hongmao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hongmao.bean.ProjectInfo;

/**
 * 项目mapper接口
 * 
 * @author yanlianshan
 *
 */
public interface ProjectInfoMapper {
	/**
	 * 查找某一用户的所有项目
	 * 
	 * @param userId 用户id
	 * @return 项目集合
	 */
	public List<ProjectInfo> findProject(@Param("userId") Integer userId);

	/**
	 * 根据id获取项目
	 * 
	 * @param projectId 项目id
	 * @return 项目对象
	 */
	public ProjectInfo findProjectById(@Param("projectId") Integer projectId);

	/**
	 * 添加项目
	 * 
	 * @param projectInfo 项目对象
	 * @return 影响行数
	 */
	public int insertProject(@Param("projectInfo") ProjectInfo projectInfo);

	/**
	 * 根据项目id删除项目
	 * 
	 * @param projectId 项目id
	 * @return 影响行数
	 */
	public int deleteProject(@Param("projectId") Integer projectId);
}
