package com.zhoujianqi.model.vo.h5;

import com.zhoujianqi.model.entity.order.OrderItem;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

//结算实体类
@Data
public class TradeVo {
    //结算总金额
    private BigDecimal totalAmount;
    //结算商品列表
    private List<OrderItem> orderItemList;

}