package com.jk.service.impl;


import com.jk.mapper.HktMapper;
import com.jk.model.lx.Scenic;
import com.jk.service.HktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HktServiceImpl implements HktService {



    @Autowired
    private HktMapper hktMapper;


    @Override
    public List<Scenic> query() {

        return hktMapper.query();

    }

    @Override
    public void updataid(Integer scenicid) {
        hktMapper.updataid(scenicid);

    }

    @Override
    public List<Scenic> queryid() {
        return hktMapper.queryid();
    }

    @Override
    public void updataids(Integer scenicid) {
        hktMapper.updataids(scenicid);


    }

}
