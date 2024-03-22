package com.zhoujianqi.model.entity.product;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

//品牌实体类
@Data
public class Brand extends BaseEntity {
	//品牌名称
	private String name;
	//品牌logo
	private String logo;

}