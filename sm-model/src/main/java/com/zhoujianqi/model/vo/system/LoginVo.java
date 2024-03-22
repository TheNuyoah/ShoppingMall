package com.zhoujianqi.model.vo.system;

import lombok.Data;

//登录成功响应结果实体类
@Data
public class LoginVo {
    //令牌
    private String token ;
    //刷新令牌,可以为空
    private String refresh_token ;

}
