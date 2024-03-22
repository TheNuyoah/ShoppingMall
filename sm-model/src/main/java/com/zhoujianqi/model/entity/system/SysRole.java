package com.zhoujianqi.model.entity.system;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

//角色实体类
@Data
public class SysRole extends BaseEntity {

    private static final long serialVersionUID = 1L;
    //角色名称
    private String roleName;
    //角色编码
    private String roleCode;
    //描述
    private String description;

}
