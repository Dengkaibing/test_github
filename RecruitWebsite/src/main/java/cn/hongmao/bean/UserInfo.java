package cn.hongmao.bean;

import lombok.Data;

@Data
public class UserInfo {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 电话
	 */
	private String phone;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 身份
	 * 0：应聘方
	 * 1：招聘方
	 */
	private Integer status;
} 
