package cn.hongmao.bean;

import lombok.Data;

/**
 * 城市实体类，用于二级省市联动(籍贯)
 * 
 * @author yanlianshan
 *
 */
@Data
public class City {
//	城市id
	private Integer cityID;
//	城市名称
	private String cityName;
//	省份id
	private Integer provincialID;

}
