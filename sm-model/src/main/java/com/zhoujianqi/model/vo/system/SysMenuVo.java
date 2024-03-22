package com.zhoujianqi.model.vo.system;

import lombok.Data;
import java.util.List;

//系统菜单响应结果实体类
@Data
public class SysMenuVo {
    //系统菜单标题
    private String title;
    //系统菜单名称
    private String name;
    //系统菜单子菜单列表
    private List<SysMenuVo> children;

}