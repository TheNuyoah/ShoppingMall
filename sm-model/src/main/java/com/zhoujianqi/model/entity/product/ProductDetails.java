package com.zhoujianqi.model.entity.product;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

@Data
public class ProductDetails extends BaseEntity {

	// 产品ID
	private Long productId;
	// 图片URLs
	private String imageUrls;

}