package com.ioto.dao;

import com.ioto.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Creater dengting on 2018/3/22
 */
public interface  ShopDao {
    /**
     * 新建店铺
     */
    int insertShop(Shop shop);

    int updateShop(Shop shop);

    /**
     * 分页查询店铺，可输入的条件有：店铺名(模糊),店铺状态，店铺类别，区域Id,owner
     *
     * @param shopCondition
     * @param rowIndex
     *            从第几行开始取数据
     * @param pageSize
     *            返回的条数
     * @return
     */
    List<Shop> queryShopList(@Param("shopCondition") Shop shopCondition, @Param("rowIndex") int rowIndex,
                             @Param("pageSize") int pageSize);

    /**
     * 返回queryShopList总数
     *
     * @param shopCondition
     * @return
     */
    int queryShopCount(@Param("shopCondition") Shop shopCondition);

    /**
     * 通过shop id 查询店铺
     *
     * @param shopId
     * @return shop
     */
    Shop queryByShopId(long shopId);


}
