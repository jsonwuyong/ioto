package com.ioto.dao;

import com.ioto.entity.Shop;

/**
 * Creater dengting on 2018/3/22
 */
public interface  ShopDao {
    /**
     * 新建店铺
     */
    int insertShop(Shop shop);

    int updateShop(Shop shop);

}
