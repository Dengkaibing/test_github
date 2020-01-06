package cn.hongmao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hongmao.bean.UserInfo;
import cn.hongmao.mapper.UserInfoMapper;
import cn.hongmao.service.UserInfoService;
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Resource
	private UserInfoMapper userInfoMapper;
	
	
	
	
	@Override
	public String loginByPhone(String phone, int scode, int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUserByPhone(UserInfo userInfo) {
				String msg = null;
				UserInfo user = userInfoMapper.getUserByPhonePass(userInfo.getPhone(), userInfo.getPassword());
				System.err.println(user);
				System.out.println("impl" + userInfo );
				if (user== null) {
					msg = "电话号码或密码错误";
					return msg;
				}
				System.out.println(msg);
				return msg;
	}

	@Override
	public boolean getUserByPhone(String phone) {
		// TODO Auto-generated method stub
		return userInfoMapper.getUserByPhone(phone)!=null;
	}

	@Override
	public List<UserInfo> find(UserInfo user) {
		// TODO Auto-generated method stub
		return userInfoMapper.find(user);
	}

	@Override
	public UserInfo findById(Integer id) {
		// TODO Auto-generated method stub
		return userInfoMapper.findById(id);
	}

	@Override
	public boolean insert(UserInfo user) {
		System.out.println(user);
		return userInfoMapper.insert(user) > 0;
	}

	@Override
	public UserInfo getUserInfoByPhone(String phone) {
				return userInfoMapper.getUserByPhone(phone);
	}

	@Override
	public UserInfo findUserInfo(UserInfo userInfo) {
		return userInfoMapper.findUserInfo(userInfo);
	}

	@Override
	public boolean updatePassword(Integer userId, String newPassword) {
		return userInfoMapper.updatePassword(userId, newPassword) > 0;
	}


}
