package com.zhoujianqi.model.entity.order;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

//订单日志实体对象
@Data
public class OrderLog extends BaseEntity {

   private static final long serialVersionUID = 1L;
   //订单id
   private Long orderId;
   //操作人：用户；系统；后台管理员
   private String operateUser;
   //订单状态
   private Integer processStatus;
   //备注
   private String note;

}