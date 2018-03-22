package com.ioto.service.impl;

import com.ioto.dao.AreaDao;
import com.ioto.entity.Area;
import com.ioto.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Creater dengting on 2018/3/21
 */
@Service
public class AreaServiceImpl implements AreaService{

    @Autowired
    private AreaDao areaDao;


    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
