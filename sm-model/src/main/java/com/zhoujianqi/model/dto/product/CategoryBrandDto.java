package com.zhoujianqi.model.dto.product;

import lombok.Data;

//搜索条件实体类
@Data
public class CategoryBrandDto {
	//品牌id
	private Long brandId;
	//分类id
	private Long categoryId;

}