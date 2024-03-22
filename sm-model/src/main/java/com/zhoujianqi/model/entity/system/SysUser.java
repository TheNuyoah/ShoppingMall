package com.zhoujianqi.model.entity.system;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

//系统用户实体类
@Data
public class SysUser extends BaseEntity {
	//用户名
	private String userName;
	//密码
	private String password;
	//昵称
	private String name;
	//手机号码
	private String phone;
	//图像
	private String avatar;
	//描述
	private String description;
	//状态（1：正常 0：停用）
	private Integer status;

}