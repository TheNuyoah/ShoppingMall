package com.zhoujianqi.model.dto.h5;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

//注册对象
@Data
public class UserRegisterDto {
    //用户名
    private String username;
    //密码
    private String password;
    //昵称
    private String nickName;
    //手机验证码
    private String code ;

}