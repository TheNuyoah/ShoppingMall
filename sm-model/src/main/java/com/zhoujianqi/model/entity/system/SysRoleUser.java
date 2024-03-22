package com.zhoujianqi.model.entity.system;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

@Data
public class SysRoleUser extends BaseEntity {
    // 角色id
    private Long roleId;
    // 用户id
    private Long userId;

}
