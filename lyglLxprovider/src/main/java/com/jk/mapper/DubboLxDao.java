package com.jk.mapper;

import com.jk.model.lx.LoginUser;
import com.jk.model.lx.userIpname;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DubboLxDao {
    List<LoginUser> selectUSerCount(@Param("username") String username, @Param("password") String password);

    void adduserlogin(userIpname ulgname);

    List<LoginUser> yanusername(String username);

    void saveuser(LoginUser user);

    List<userIpname> zuijingdenglu(String username);

    void deletesipname(Integer pid);

    List<userIpname> zuijingdenglucountlist(@Param("limit") Integer limit,@Param("offset")  Integer offset,@Param("sort")  String sort,@Param("order")  String order,@Param("username") String username);
}
