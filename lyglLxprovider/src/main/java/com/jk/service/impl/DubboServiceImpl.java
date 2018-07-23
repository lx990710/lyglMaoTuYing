package com.jk.service.impl;

import com.jk.mapper.DubboLxDao;
import com.jk.model.lx.LoginUser;
import com.jk.model.lx.userIpname;
import com.jk.service.DubboLxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class DubboServiceImpl implements DubboLxService{

    @Resource
    private DubboLxDao buddodao;


    @Override
    public List<LoginUser> queryDenglu(String username, String password) {

        return buddodao.selectUSerCount(username,password);
    }

    @Override
    public void adduserlogin(userIpname ulgname) {
        buddodao.adduserlogin(ulgname);
    }

    @Override
    public String zhuceUser(LoginUser user) {
        String username = user.getUsername();
        List<LoginUser>  list =  buddodao.yanusername(username);
        if(list.size()==1){
            return "loginfile";
        }else if(list.size()==0){
            buddodao.saveuser(user);
            return "success";
        }
        return "loginyichang";
    }
    @Override
    public List<userIpname> zuijingdenglu(String username) {
        return buddodao.zuijingdenglu(username);
    }
    @Override
    public void deletesipname(Integer pid) {
        buddodao.deletesipname(pid);
    }

    @Override
    public List<userIpname> zuijingdenglucountlist(Integer limit, Integer offset, String sort, String order,String username) {
        return buddodao.zuijingdenglucountlist(limit,offset,sort,order,username);
    }
}
