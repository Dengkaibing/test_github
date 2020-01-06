package cn.hongmao.service;

import java.util.List;

import cn.hongmao.bean.ProjectInfo;

/**
 * 项目业务接口
 * 
 * @author yanlianshan
 *
 */
public interface ProjectInfoService {
	/**
	 * 查找某一用户的所有项目
	 * 
	 * @param userId 用户id
	 * @return 项目集合
	 */
	public List<ProjectInfo> findProject(Integer userId);

	/**
	 * 根据id获取项目
	 * 
	 * @param projectId 项目id
	 * @return 项目对象
	 */
	public ProjectInfo findProjectById(Integer projectId);

	/**
	 * 添加项目
	 * 
	 * @param projectInfo 项目对象
	 * @return 影响行数
	 */
	public boolean insertProject(ProjectInfo projectInfo);

	/**
	 * 根据项目id删除项目
	 * 
	 * @param projectId 项目id
	 * @return 影响行数
	 */
	public boolean deleteProject(Integer projectId);
}
