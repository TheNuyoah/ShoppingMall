package com.zhoujianqi.model.entity.h5;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;

//购物车实体类
@Data
public class CartInfo extends BaseEntity {
   
   private static final long serialVersionUID = 1L;
   //用户id
   private Long userId;
   //skuid
   private Long skuId;
   //放入购物车时价格
   private BigDecimal cartPrice;
   //数量
   private Integer skuNum;
   //图片文件
   private String imgUrl;
   //sku名称 (冗余)
   private String skuName;
   //isChecked
   private Integer isChecked;
    
}