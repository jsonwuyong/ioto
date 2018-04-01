package com.ioto.dao;

import com.ioto.entity.ShopCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Creater dengting on 2018/4/1
 */
public interface ShopCategoryDao {

    List<ShopCategory> queryShopCategore(@Param("shopCategoryCondition") ShopCategory shopCategoryCondition);

}
