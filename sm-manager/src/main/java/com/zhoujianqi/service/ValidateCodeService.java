package com.zhoujianqi.service;


import com.zhoujianqi.model.vo.system.ValidateCodeVo;

public interface ValidateCodeService {

    // 获取验证码图片
    public abstract ValidateCodeVo generateValidateCode();

}
