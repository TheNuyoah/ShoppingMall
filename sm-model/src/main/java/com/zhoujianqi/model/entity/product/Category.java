package com.zhoujianqi.model.entity.product;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;
import java.util.List;

//分类实体类
@Data
public class Category extends BaseEntity {
	//分类名称
	private String name;
	//分类图片url
	private String imageUrl;
	//父节点id
	private Long parentId;
	//分类状态: 是否显示[0-不显示，1显示]
	private Integer status;
	//排序字段
	private Integer orderNum;
	//是否存在子节点
	private Boolean hasChildren;
	//子节点List集合
	private List<Category> children;

}