package com.zhoujianqi.model.dto.order;

import lombok.Data;

//搜索条件实体类
@Data
public class OrderStatisticsDto {
    //开始时间
    private String createTimeBegin;
    //结束时间
    private String createTimeEnd;

}
