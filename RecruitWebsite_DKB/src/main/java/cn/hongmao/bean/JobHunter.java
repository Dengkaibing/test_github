package cn.hongmao.bean;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * 求职方信息实体类
 * 
 * @author yanlianshan
 */
@Data
public class JobHunter {
//	信息id

	private Integer jId;
//	用户id
	private Integer userId;
//	用户姓名
	private String jName;
//	用户邮箱
	private String jEmail;
//	性别
	private Integer jSex;
//	籍贯
	private String jPlace;
//	学校
	private String jSchool;
//	专业
	private String jMajor;
//	入学时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	private Date entryTime;
//	毕业时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	private Date graduateTime;
//	个人技能
	private String jSkill;
//	在校经历
	private String jExperience;
//	求职意向
	private String jJob;

//	薪资要求
	
	private Double jSalary;
//	base地
	private String jBase;
//	头像
	private String jImage;
// 出生日期
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	private Date jBirth;
//学历
	private String jEducation;
}
