package cn.hongmao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hongmao.bean.ProjectInfo;
import cn.hongmao.mapper.ProjectInfoMapper;
import cn.hongmao.service.ProjectInfoService;

@Service("projectInfoService")
public class ProjectInfoServiceImpl implements ProjectInfoService {
	@Resource
	private ProjectInfoMapper projectInfoMapper;

	@Override
	public List<ProjectInfo> findProject(Integer userId) {
		return projectInfoMapper.findProject(userId);
	}

	@Override
	public ProjectInfo findProjectById(Integer projectId) {
		return projectInfoMapper.findProjectById(projectId);
	}

	@Override
	public boolean insertProject(ProjectInfo projectInfo) {
		return projectInfoMapper.insertProject(projectInfo) > 0;
	}

	@Override
	public boolean deleteProject(Integer projectId) {
		return projectInfoMapper.deleteProject(projectId) > 0;
	}

}
