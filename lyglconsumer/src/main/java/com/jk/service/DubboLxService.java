package com.jk.service;

import com.jk.model.lx.LoginUser;
import com.jk.model.lx.userIpname;

import java.beans.beancontext.BeanContextMembershipEvent;
import java.util.List;

public interface DubboLxService {
    List<LoginUser> queryDenglu(String username, String password);

    void adduserlogin(userIpname ulgname);

    String zhuceUser(LoginUser user);

    List<userIpname> zuijingdenglu( String username);

    void deletesipname(Integer pid);

    List<userIpname> zuijingdenglucountlist(Integer limit, Integer offset, String sort, String order,String username);
}
