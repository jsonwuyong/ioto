package com.ioto.service.impl;

import com.ioto.dao.ShopCategoryDao;
import com.ioto.entity.ShopCategory;
import com.ioto.service.ShopCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Creater dengting on 2018/4/1
 */
@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {

    @Autowired
    private ShopCategoryDao shopCategoryDao;

    private static Logger logger = LoggerFactory.getLogger(ShopCategoryServiceImpl.class);


    @Override
    public List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition) {
        return shopCategoryDao.queryShopCategore(shopCategoryCondition);
    }
}
