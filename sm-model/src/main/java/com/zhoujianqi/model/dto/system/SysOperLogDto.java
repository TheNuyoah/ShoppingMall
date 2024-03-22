package com.zhoujianqi.model.dto.system;

import lombok.Data;

//请求参数实体类
@Data
public class SysOperLogDto {
    //模块名称
    private String title;
    //操作用户名
    private String operName;
    //开始时间
    private String createTimeBegin;
    //结束时间
    private String createTimeEnd;

}
