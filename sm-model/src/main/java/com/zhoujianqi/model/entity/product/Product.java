package com.zhoujianqi.model.entity.product;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;
import java.util.List;

//商品实体类
@Data
public class Product extends BaseEntity {
    //商品名称
    private String name;
    //品牌id
    private Long brandId;
    //一级分类id
    private Long category1Id;
    //二级分类id
    private Long category2Id;
    //三级分类id
    private Long category3Id;
    //计量单位
    private String unitName;
    //轮播图url
    private String sliderUrls;
    //商品规格值json串
    private String specValue;
    //线上状态：0-初始值，1-上架，-1-自主下架
    private Integer status;
    //审核状态
    private Integer auditStatus;
    //审核信息
    private String auditMessage;
    //品牌名称
    // 扩展的属性，用来封装响应的数据
    private String brandName;
    //一级分类名称
    private String category1Name;
    //二级分类名称
    private String category2Name;
    //三级分类名称
    private String category3Name;
    //sku列表集合
    private List<ProductSku> productSkuList;
    //图片详情列表
    private String detailsImageUrls;

}