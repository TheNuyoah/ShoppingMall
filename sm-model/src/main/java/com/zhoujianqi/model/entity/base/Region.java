package com.zhoujianqi.model.entity.base;

import lombok.Data;

//区域实体类
@Data
public class Region extends BaseEntity {
	//区域编码
	private String code;
	//父区域编码
	private Long parentCode;
	//父区名称
	private String name;
	//地区级别：1-省、自治区、直辖市 2-地级市、地区、自治州、盟 3-市辖区、县级市、县
	private Integer level;

}