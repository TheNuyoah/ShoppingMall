package com.zhoujianqi.controller;

import com.zhoujianqi.model.dto.system.LoginDto;
import com.zhoujianqi.model.vo.common.Result;
import com.zhoujianqi.model.vo.common.ResultCodeEnum;
import com.zhoujianqi.model.vo.system.LoginVo;
import com.zhoujianqi.model.vo.system.ValidateCodeVo;
import com.zhoujianqi.service.SysUserService;
import com.zhoujianqi.service.ValidateCodeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Index接口
 */
@RestController
@RequestMapping(value = "/admin/system/index")
public class IndexController {

    @Autowired
    SysUserService sysUserService ;
    @Autowired
    ValidateCodeService validateCodeService;

    /**
     * 登录接口
     * @param loginDto
     * @return
     */
    @PostMapping(value = "/login")
    public Result<LoginVo> login(@RequestBody LoginDto loginDto) {
        LoginVo loginVo = sysUserService.login(loginDto) ;
        return Result.build(loginVo , ResultCodeEnum.SUCCESS) ;
    }

    /**
     * 生成图片验证码
     * @return
     */
    @GetMapping(value = "/generateValidateCode")
    public Result<ValidateCodeVo> generateValidateCode() {
        ValidateCodeVo validateCodeVo = validateCodeService.generateValidateCode();
        return Result.build(validateCodeVo , ResultCodeEnum.SUCCESS) ;
    }
}