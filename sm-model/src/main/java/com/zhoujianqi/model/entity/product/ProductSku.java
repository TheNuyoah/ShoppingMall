package com.zhoujianqi.model.entity.product;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;
import java.math.BigDecimal;

//ProductSku
@Data
public class ProductSku extends BaseEntity {
	//商品编号
	private String skuCode;
	//skuName
	private String skuName;
	//商品ID
	private Long productId;
	//缩略图路径
	private String thumbImg;
	//售价
	private BigDecimal salePrice;
	//市场价
	private BigDecimal marketPrice;
	//成本价
	private BigDecimal costPrice;
	//库存数
	private Integer stockNum;
	//销量
	private Integer saleNum;
	//sku规格信息json
	private String skuSpec;
	//重量
	private String weight;
	//体积
	private String volume;
	//线上状态：0-初始值，1-上架，-1-自主下架
	private Integer status;

}