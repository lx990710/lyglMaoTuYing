package com.jk.controller.lx;

import com.alibaba.fastjson.JSON;
import com.jk.model.lx.Scenic;
import com.jk.service.DubboLxService;
import com.jk.service.HktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("DubboController")

public class DubboController {

    @RequestMapping("query")
    @ResponseBody
    public String query(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        ac.start();
        HktService hktService= (HktService) ac.getBean("dubbohktService");
      List<Scenic> list = hktService.query();

      return JSON.toJSONString(list);

    }

     @RequestMapping("updataid")
     @ResponseBody
     public void updataid(Integer scenicid){
         ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
         ac.start();
         HktService hktService= (HktService) ac.getBean("dubbohktService");
        hktService.updataid(scenicid);


    }

    @RequestMapping("queryid")
    @ResponseBody
    public String queryid(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        ac.start();
        HktService hktService= (HktService) ac.getBean("dubbohktService");
       List<Scenic>list =  hktService.queryid();

       return JSON.toJSONString(list);

    }

    @RequestMapping("updataids")
    @ResponseBody
    public void updataids(Integer scenicid){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        ac.start();
        HktService hktService= (HktService) ac.getBean("dubbohktService");
        hktService.updataids(scenicid);
    }




}
