package com.zhoujianqi.model.vo.system;

import lombok.Data;

//验证码响应结果实体类
@Data
public class ValidateCodeVo {
    //验证码key
    private String codeKey ;
    //验证码value
    private String codeValue ;

}