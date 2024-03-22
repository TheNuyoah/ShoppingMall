package com.zhoujianqi.model.dto.h5;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

//用户登录请求参数
@Data
public class UserLoginDto {
    //用户名
    private String username ;
    //密码
    private String password ;
}