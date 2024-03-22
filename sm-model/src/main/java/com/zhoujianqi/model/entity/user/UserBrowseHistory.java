package com.zhoujianqi.model.entity.user;

import com.zhoujianqi.model.entity.base.BaseEntity;
import lombok.Data;

//用户收藏实体类
@Data
public class UserBrowseHistory extends BaseEntity {

    private static final long serialVersionUID = 1L;
    //用户ID
    private Long userId;
    //商品skuID
    private Long skuId;

}