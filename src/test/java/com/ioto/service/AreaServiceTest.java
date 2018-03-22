package com.ioto.service;

import com.ioto.dao.BaseTest;
import com.ioto.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Creater dengting on 2018/3/21
 */
public class AreaServiceTest extends BaseTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList() {
        List<Area> areaList = areaService.getAreaList();
        assertEquals("西苑", areaList.get(0).getAreaName());
        areaList = areaService.getAreaList();
        System.out.print(areaList.get(0).getAreaName());
    }

}
