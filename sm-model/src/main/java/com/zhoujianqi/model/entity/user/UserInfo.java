package com.zhoujianqi.model.entity.user;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;

//用户实体类
@Data
public class UserInfo extends BaseEntity {

   private static final long serialVersionUID = 1L;
   //用户名
   private String username;
   //密码
   private String password;
   //昵称
   private String nickName;
   //头像
   private String avatar;
   //性别
   private Integer sex;
   //电话号码
   private String phone;
   //备注
   private String memo;
   //微信open id
   private String openId;
   //微信开放平台unionID
   private String unionId;
   //最后一次登录ip
   private String lastLoginIp;
   //最后一次登录时间
   private Date lastLoginTime;
   //状态：1为正常，0为禁止
   private Integer status;

}