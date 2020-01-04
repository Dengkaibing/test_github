package cn.hongmao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hongmao.bean.UserInfo;

public interface UserInfoMapper {

	/**
	 * 查找全部用户
	 * 
	 * @param user
	 * @return
	 */
	public List<UserInfo> find(UserInfo user);

	/**
	 * 根据电话号码查用户
	 * 
	 * @param phone
	 * @return
	 */
	public UserInfo getUserByPhone(String phone);

	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return
	 */
	public int insert(UserInfo user);

	/**
	 * 根据ID查找
	 * 
	 * @param id
	 * @return
	 */
	public UserInfo findById(@Param("id") Integer id);

	/**
	 * 查找某个用户
	 * 
	 * @param userInfo 用户对象
	 * @return 用户对象
	 */
	public UserInfo findUserInfo(@Param("userInfo") UserInfo userInfo);

	/**
	 * 修改密码
	 * 
	 * @param userInfo    用户对象
	 * @param newPassword 新密码
	 * @return
	 */
	public int updatePassword(@Param("userId") Integer userId, @Param("newPassword") String newPassword);
	

	/**
	 * 根据电话号码密码查用户
	 * 
	 * @param phone
	 * @return
	 */
	public UserInfo getUserByPhonePass(String phone, String password);
}
