package com.zhoujianqi.model.entity.base;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

//产品单元实体类
@Data
@Schema(description = "产品单元实体类")
public class ProductUnit extends BaseEntity {
	//名称
	private String name;

}