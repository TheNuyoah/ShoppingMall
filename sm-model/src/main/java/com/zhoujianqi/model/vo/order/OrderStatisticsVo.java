package com.zhoujianqi.model.vo.order;

import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

//统计结果实体类
@Data
public class OrderStatisticsVo {
    //日期数据集合
    private List<String> dateList ;
    //总金额数据集合
    private List<BigDecimal> amountList ;
}
