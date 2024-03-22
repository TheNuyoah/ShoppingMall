package com.zhoujianqi.model.dto.product;

import lombok.Data;

/**
 * SkuSaleDto 销售DTO
 */
@Data
public class SkuSaleDto {

	/**
	 * skuId 商品ID
	 */
	private Long skuId;
	/**
	 * num 销售数量
	 */
	private Integer num;

}

