package com.zhoujianqi.model.dto.system;

import lombok.Data;

import java.util.List;

//请求参数实体类
@Data
public class AssginRoleDto {
    //用户id
    private Long userId;
    //角色id的List集合
    private List<Long> roleIdList;

}
