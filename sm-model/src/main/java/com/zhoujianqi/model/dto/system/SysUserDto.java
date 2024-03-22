package com.zhoujianqi.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

//请求参数实体类
@Data
public class SysUserDto {
    //搜索关键字
    private String keyword ;
    //开始时间
    private String createTimeBegin ;
    //结束时间
    private String createTimeEnd;

}
