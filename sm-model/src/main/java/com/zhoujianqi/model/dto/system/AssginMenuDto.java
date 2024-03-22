package com.zhoujianqi.model.dto.system;

import lombok.Data;

import java.util.List;
import java.util.Map;

//请求参数实体类
@Data
public class AssginMenuDto {
    //角色id
    private Long roleId;
    //选中的菜单id的集合
    private List<Map<String , Number>> menuIdList;
    // Map的键表示菜单的id，值表示是否为半开; 0否，1是
    //List<Map<String , Number>>中
    //第一列 key : id   value : 菜单id 值
    //第一列 key ：isHalf   value : 0 或者 1
    //菜单都选择就是0（全开），否则就是1（半开）
}