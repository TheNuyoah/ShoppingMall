package com.zhoujianqi.model.entity.order;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;


@Data
public class OrderStatistics extends BaseEntity {

    /** 订单日期 */
    private Date orderDate;
    /** 订单总金额 */
    private BigDecimal totalAmount;
    /** 订单总数量 */
    private Integer totalNum;
    
}