package com.zhoujianqi.model.vo.h5;

import com.zhoujianqi.model.entity.product.Category;
import com.zhoujianqi.model.entity.product.ProductSku;
import lombok.Data;
import java.util.List;

@Data
public class IndexVo {
    // 一级分类的类别数据
    private List<Category> categoryList ;
    // 畅销商品列表数据
    private List<ProductSku> productSkuList ;

}