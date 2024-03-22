package com.zhoujianqi.model.entity.pay;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

//支付信息实体类
@Data
public class PaymentInfo extends BaseEntity {

   private static final long serialVersionUID = 1L;
   //用户id
   private Long userId;
   //订单号
   private String orderNo;
   //付款方式：1-微信 2-支付宝
   private Integer payType;
   //交易编号（微信或支付）
   private String outTradeNo;
   //支付金额
   private BigDecimal amount;
   //交易内容
   private String content;
   //支付状态：0-未支付 1-已支付
   private Integer paymentStatus;
   //回调时间
   private Date callbackTime;
   //回调信息
   private String callbackContent;

}