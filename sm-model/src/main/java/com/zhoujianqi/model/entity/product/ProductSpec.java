package com.zhoujianqi.model.entity.product;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

//商品规格实体类
@Data
public class ProductSpec extends BaseEntity {
	//规格名称
	private String specName;   // 规格名称
	//规格值
	private String specValue;  // 规格值

}