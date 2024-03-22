package com.zhoujianqi.model.dto.system;

import lombok.Data;

//用户登录请求参数
@Data
public class LoginDto {
    //用户名
    private String userName ;
    //密码
    private String password ;
    //提交验证码
    private String captcha ;
    //验证码key
    private String codeKey ;

}
