package com.ioto.dao;

import com.ioto.entity.Area;

import java.util.List;

/**
 * Creater dengting on 2018/3/20
 */
public interface AreaDao {

    /**
     * 列出区域列表
     *
     * @return areaList
     */
    List<Area> queryArea();

    /**
     * 插入区域信息
     *
     * @param area
     * @return
     */
    int insertArea(Area area);


}
