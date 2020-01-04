package cn.hongmao.bean;

import lombok.Data;

@Data
public class Job {

	private String jId;
	private String jName;
	private String jExpression;

	private Integer companyId;
	private String cName;
	private String pay;
	private Integer userId;
	private String userExpression;

}
