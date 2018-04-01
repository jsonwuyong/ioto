package com.ioto.web.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Creater dengting on 2018/4/1
 */
@Controller
@RequestMapping(value = "shop",method = {RequestMethod.GET})
public class ShopAdminController {

    @RequestMapping(value = "/shoplist")
    public String shopOperation() {
        // 转发至店铺注册/编辑页面
        return "shop/shop-list";
    }
}
