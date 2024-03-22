package com.zhoujianqi.service;

import com.zhoujianqi.model.dto.system.LoginDto;
import com.zhoujianqi.model.vo.system.LoginVo;

public interface SysUserService {

    /**
     * 根据用户名查询用户数据
     * @return
     */
    public  LoginVo login(LoginDto loginDto) ;
}
