package com.zhoujianqi.model.entity.system;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

//SysOperLog
@Data
public class SysOperLog extends BaseEntity {

	private static final long serialVersionUID = 1L;
	//模块标题
	private String title;
	//方法名称
	private String method;
	//请求方式
	private String requestMethod;
	//业务类型（0其它 1新增 2修改 3删除）
	private Integer businessType ;
	//操作类别（0其它 1后台用户 2手机端用户）
	private String operatorType;
	//操作人员
	private String operName;
	//请求URL
	private String operUrl;
	//主机地址
	private String operIp;
	//请求参数
	private String operParam;
	//返回参数
	private String jsonResult;
	//操作状态（0正常 1异常）
	private Integer status;
	//错误消息
	private String errorMsg;

}