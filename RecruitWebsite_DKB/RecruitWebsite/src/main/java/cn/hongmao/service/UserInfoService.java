package cn.hongmao.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hongmao.bean.UserInfo;

public interface UserInfoService {

	/**
	 * 根据电话号码+验证码登录
	 * 
	 * @param phone
	 * @param scode
	 * @param code
	 * @return
	 */
	public String loginByPhone(String phone, int scode, int code);

	/**
	 * 根据用户名+密码登录
	 * 
	 * @param userName
	 * @return
	 */
	public String getUserByPhone(UserInfo userInfo);
	
	/**
	 * 根据电话号码查找此电话是否注册
	 * 
	 * @param phone
	 * @return
	 */
	public boolean getUserByPhone(String phone);

	/**
	 * 查询全部
	 * 
	 * @param user
	 * @return
	 */
	public List<UserInfo> find(UserInfo user);

	/**
	 * 根据ID查找
	 * 
	 * @param id
	 * @return
	 */
	public UserInfo findById(Integer id);

	/**
	 * 增加用户
	 * 
	 * @param user
	 * @return
	 */
	public boolean insert(UserInfo user);

	/**
	 * 短信登录
	 * 
	 * @param phone
	 * @return
	 */
	public UserInfo getUserInfoByPhone(String phone);

	/**
	 * 查找某个用户
	 * 
	 * @param userInfo 用户对象
	 * @return 用户对象
	 */
	public UserInfo findUserInfo(UserInfo userInfo);

	/**
	 * 修改密码
	 * 
	 * @param userInfo    用户对象
	 * @param newPassword 新密码
	 * @return
	 */
	public boolean updatePassword(Integer userId, String newPassword);
	
	



}
