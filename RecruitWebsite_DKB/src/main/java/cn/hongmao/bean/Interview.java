package cn.hongmao.bean;

import java.util.Date;

import lombok.Data;
@Data
public class Interview {
//	本次面试安排id
	private Integer iId;
//	面试时间
	private Date iTime;
//	面试地址
	private String iAddress;
//	面试职位
	private String iJob;
//	求职者id
	private Integer userId;
//	公司id
	private Integer cId;
}
