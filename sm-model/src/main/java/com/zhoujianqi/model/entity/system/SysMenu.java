package com.zhoujianqi.model.entity.system;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;
import java.util.List;

//系统菜单实体类
@Data
public class SysMenu extends BaseEntity {
	//父节点id
	private Long parentId;
	//节点标题
	private String title;
	//组件名称
	private String component;
	//排序值
	private Integer sortValue;
	//状态(0:禁止,1:正常)
	private Integer status;
	//子节点
	// 下级列表
	private List<SysMenu> children;

}