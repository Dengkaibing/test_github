package cn.hongmao.service;

import java.util.List;

import cn.hongmao.bean.Major;

/**
 * 专业业务接口
 * 
 * @author yanlianshan
 *
 */
public interface MajorService {
	/**
	 * 根据专业名模糊查找专业
	 * 
	 * @param major 专业对象
	 * @return 专业集合
	 */
	public List<Major> findMajor(Major major);
}
