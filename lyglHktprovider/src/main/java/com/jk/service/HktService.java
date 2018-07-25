package com.jk.service;




import com.jk.model.lx.Scenic;
import java.util.List;

public interface HktService {


    List<Scenic> query();


    void updataid(Integer scenicid);

    List<Scenic> queryid();

    void updataids(Integer scenicid);


}
