package com.ioto.service;

import com.ioto.entity.ShopCategory;

import java.util.List;

/**
 * Creater dengting on 2018/4/1
 */
public interface ShopCategoryService {

    public static final String SCLISTKEY = "shopcategorylist";
    /**
     * 根据查询条件获取ShopCategory列表
     *
     * @param shopCategoryCondition
     * @return
     */
    List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);

}
