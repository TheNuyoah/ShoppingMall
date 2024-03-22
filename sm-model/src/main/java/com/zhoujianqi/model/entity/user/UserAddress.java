package com.zhoujianqi.model.entity.user;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

//用户地址实体类
@Data
public class UserAddress extends BaseEntity {

   private static final long serialVersionUID = 1L;
   //用户ID
   private Long userId;
   //name
   private String name;
   //电话
   private String phone;
   //标签名称
   private String tagName;
   //provinceCode
   private String provinceCode;
   //cityCode
   private String cityCode;
   //districtCode
   private String districtCode;
   //详细地址
   private String address;
   //完整地址
   private String fullAddress;
   //是否默认地址（0：否 1：是）
   private Integer isDefault;

}