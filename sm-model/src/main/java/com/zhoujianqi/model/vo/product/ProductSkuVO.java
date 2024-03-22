package com.zhoujianqi.model.vo.product;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

//ProductSkuVO
@Data
@Schema(description = "ProductSkuVO")
public class ProductSkuVO {
	//商品编号
	private Long sukId;
	//skuName
	private String skuName;
	//创建时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	//缩略图路径
	private String thumbImg;
	//售价
	private BigDecimal salePrice;

}