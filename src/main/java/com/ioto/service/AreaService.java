package com.ioto.service;

import com.ioto.entity.Area;

import java.util.List;

/**
 * Creater dengting on 2018/3/21
 */
public interface AreaService {

    public static final String AREALISTKEY = "arealist";

    /**
     * 获取区域列表，优先从缓存获取
     *
     * @return
     */
    List<Area> getAreaList();
}
