package com.zhoujianqi.model.entity.product;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

//分类品牌实体类
@Data
public class CategoryBrand extends BaseEntity {
	//品牌id
	private Long brandId;
	//分类id
	private Long categoryId;
	//分类名称
	private String categoryName;
	//品牌名称
	private String brandName;
	//品牌logo
	private String logo;

}