package cn.hongmao.bean;

import lombok.Data;

@Data
public class Employer {
//	招聘者id
	private String eId;
//	姓名
	private String eName;
//	邮箱
	private String eEmail;
//	性别：男1，女2，未知0
	private Integer eSex;
//	招聘者头像
	private String eImage;
//	招聘者年龄
	private Integer eAge;
//	招聘者的用户id
	private Integer userId;
//	招聘者的公司id
	private Integer cId;

}
