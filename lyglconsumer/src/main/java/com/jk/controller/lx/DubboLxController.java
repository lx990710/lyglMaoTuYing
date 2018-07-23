package com.jk.controller.lx;


import com.alibaba.fastjson.JSON;
import com.jk.model.lx.LoginUser;
import com.jk.model.lx.userIpname;
import com.jk.service.DubboLxService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("DubboLxController")
public class DubboLxController {



    //登录
    @RequestMapping("queryDenglu")
    @ResponseBody
    public String queryDenglu(String username,String password, HttpServletRequest request){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        ac.start();
        DubboLxService dubbolxservice= (DubboLxService) ac.getBean("dubbolxService");
        String code = (String)request.getSession().getAttribute("rand");
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println("本机IP:"	+ inetAddress.getHostAddress().toString());
        System.out.println("本机名称:" + inetAddress.getHostName().toString());
        String loginFlag = "error";//扩大作用域
        List<LoginUser> list= dubbolxservice.queryDenglu(username,password);
        if(list.size()==1){
            request.getSession().setAttribute("user", list.get(0));
            userIpname ulgname = new userIpname();
            String ipadress = inetAddress.getHostAddress().toString();
            String Idname = inetAddress.getHostName().toString();
            ulgname.setIpadress(ipadress);
            ulgname.setIdname(Idname);
            ulgname.setUsername(username);
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
            String hehe = dateFormat.format(now);
            System.out.println(hehe);
            ulgname.setDenglushijian(hehe);
            dubbolxservice.adduserlogin(ulgname);

            loginFlag =  "loginSuccess";
        }
        return loginFlag;
    }

    @RequestMapping("zhuceUser")
    @ResponseBody
    public  String zhuceUser(HttpServletRequest request,LoginUser user,String imageCode){
        String loginFlag = "CodeFail";//扩大作用域
        String code = (String)request.getSession().getAttribute("rand");
        if(code.equals(imageCode.toLowerCase())&&imageCode!=""){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        ac.start();
        DubboLxService dubbolxservice= (DubboLxService) ac.getBean("dubbolxService");
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            user.setZhuceshijian(df.format(new Date()));
            loginFlag =  dubbolxservice.zhuceUser(user);
        }
        return loginFlag;
    }

   /* @RequestMapping("zuijingdenglu")
    @ResponseBody
    public  String zuijingdenglu(HttpServletRequest request){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        ac.start();
        DubboLxService dubbolxservice= (DubboLxService) ac.getBean("dubbolxService");

        LoginUser user = (LoginUser) request.getSession().getAttribute("user");
        String username = user.getUsername();
        List<userIpname>list = dubbolxservice.zuijingdenglu(limit, offset, sort, username);
        return JSON.toJSONString(list);
    }*/

    @RequestMapping("deletesipname")
    @ResponseBody
    public  String deletesipname(Integer pid){

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        ac.start();
        DubboLxService dubbolxservice= (DubboLxService) ac.getBean("dubbolxService");
        dubbolxservice.deletesipname(pid);
        return "success";
    }

    @RequestMapping("getPerson")
    @ResponseBody
    public Map<String,Object> getPerson(Integer limit,Integer offset,String sort,String order,HttpServletRequest request){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        ac.start();
        DubboLxService dubbolxservice= (DubboLxService) ac.getBean("dubbolxService");
        Map<String,Object> map = new HashMap<String, Object>();
        LoginUser user = (LoginUser) request.getSession().getAttribute("user");
        String username = user.getUsername();
        Integer	total = dubbolxservice.zuijingdenglu(username).size();
        map.put("total", total);
        map.put("rows", dubbolxservice.zuijingdenglucountlist(limit,offset,sort,order,username));
        return map;
    }
}
