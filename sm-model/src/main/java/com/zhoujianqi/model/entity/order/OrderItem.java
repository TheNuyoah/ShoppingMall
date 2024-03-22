package com.zhoujianqi.model.entity.order;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;
import java.math.BigDecimal;

//订单项实体类
@Data
public class OrderItem extends BaseEntity {

   private static final long serialVersionUID = 1L;
   //订单id
   private Long orderId;
   //商品sku编号
   private Long skuId;
   //商品sku名字
   private String skuName;
   //商品sku图片
   private String thumbImg;
   //商品sku价格
   private BigDecimal skuPrice;
   //商品购买的数量
   private Integer skuNum;

}