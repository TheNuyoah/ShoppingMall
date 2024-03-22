package com.zhoujianqi.mapper;

import com.zhoujianqi.model.entity.system.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper {

    /**
     * 根据用户名查询用户数据
     * @param userName
     * @return
     */
    public SysUser selectByUserName(String userName) ;
}