package cn.hongmao.bean;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Company {

	private Integer cId;
	private String cName;
	private String cAddress;
	private String cType;
	private String cInfo;
	private int cIsMarket;//0代表未上市，1代表已上市
	private String cHotJob;
	private String cHotPay;
	private String cCount;
	private String cRepresentative;
	private String cCost;
	private Date cCreateTime;
	private String cImage;
	
	private List<Job> jobs; 

}
