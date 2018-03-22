package com.ioto.dao;

import com.ioto.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Creater dengting on 2018/3/20
 */
public class AreaDaoTest extends BaseTest{


    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areaList = areaDao.queryArea();
        String name = "";
        for (Area area : areaList){
            name = area.getAreaName();
        }
        System.out.print(name);
        assertEquals(2, areaList.size());
    }
}
