package com.jk.model.lx;

import java.io.Serializable;

public class LoginUser implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;

    private Integer userid;
    private String  username;
    private String password ;
    private String zhenshiname ;
    private Integer sex;

    private Integer age;
    private String  address;
    private String  lianxidianhua;

    private String qq;
    private String email;
    private Integer zhuangtai;

    private String zhuceshijian;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getZhenshiname() {
        return zhenshiname;
    }

    public void setZhenshiname(String zhenshiname) {
        this.zhenshiname = zhenshiname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLianxidianhua() {
        return lianxidianhua;
    }

    public void setLianxidianhua(String lianxidianhua) {
        this.lianxidianhua = lianxidianhua;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(Integer zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public String getZhuceshijian() {
        return zhuceshijian;
    }

    public void setZhuceshijian(String zhuceshijian) {
        this.zhuceshijian = zhuceshijian;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", zhenshiname='" + zhenshiname + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", lianxidianhua='" + lianxidianhua + '\'' +
                ", qq='" + qq + '\'' +
                ", email='" + email + '\'' +
                ", zhuangtai=" + zhuangtai +
                ", zhuceshijian='" + zhuceshijian + '\'' +
                '}';
    }
}
