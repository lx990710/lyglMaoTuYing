package com.jk.model.lx;

import java.io.Serializable;

public class userIpname implements Serializable {


    private static final long serialVersionUID = -656167099433842747L;


    private Integer pid;

    private String ipadress;

    private String idname;
    private String username;

    private String denglushijian;


    private String imageCode;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getIpadress() {
        return ipadress;
    }

    public void setIpadress(String ipadress) {
        this.ipadress = ipadress;
    }

    public String getIdname() {
        return idname;
    }

    public void setIdname(String idname) {
        this.idname = idname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDenglushijian() {
        return denglushijian;
    }

    public void setDenglushijian(String denglushijian) {
        this.denglushijian = denglushijian;
    }

    public String getImageCode() {
        return imageCode;
    }

    public void setImageCode(String imageCode) {
        this.imageCode = imageCode;
    }

    @Override
    public String toString() {
        return "userIpname{" +
                "pid=" + pid +
                ", ipadress='" + ipadress + '\'' +
                ", idname='" + idname + '\'' +
                ", username='" + username + '\'' +
                ", denglushijian='" + denglushijian + '\'' +
                ", imageCode='" + imageCode + '\'' +
                '}';
    }
}
