package com.jk.mapper;


import com.jk.model.lx.Scenic;
import java.util.List;


public interface HktMapper {


    List<Scenic> query();

    void updataid(Integer scenicid);

    List<Scenic> queryid();

    void updataids(Integer scenicid);
}
