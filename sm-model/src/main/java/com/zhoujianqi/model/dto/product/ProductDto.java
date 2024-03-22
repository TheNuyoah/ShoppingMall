package com.zhoujianqi.model.dto.product;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

//商品搜索条件实体类
@Data
public class ProductDto extends BaseEntity {
    //品牌id
    private Long brandId;
    //一级分类id
    private Long category1Id;
    //二级分类id
    private Long category2Id;
    //三级分类id
    private Long category3Id;

}
