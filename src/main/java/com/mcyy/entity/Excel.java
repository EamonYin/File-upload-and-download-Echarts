package com.mcyy.entity;

import java.util.Date;

public class Excel {
    private Integer id;

    private String salmedicinename;

    private String salamount;

    private String salprice;

    private Date saldate;

    private String salname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSalmedicinename() {
        return salmedicinename;
    }

    public void setSalmedicinename(String salmedicinename) {
        this.salmedicinename = salmedicinename == null ? null : salmedicinename.trim();
    }

    public String getSalamount() {
        return salamount;
    }

    public void setSalamount(String salamount) {
        this.salamount = salamount == null ? null : salamount.trim();
    }

    public String getSalprice() {
        return salprice;
    }

    public void setSalprice(String salprice) {
        this.salprice = salprice == null ? null : salprice.trim();
    }

    public Date getSaldate() {
        return saldate;
    }

    public void setSaldate(Date saldate) {
        this.saldate = saldate;
    }

    public String getSalname() {
        return salname;
    }

    public void setSalname(String salname) {
        this.salname = salname == null ? null : salname.trim();
    }

    @Override
    public String toString() {
        return "Excel{" +
                "id=" + id +
                ", salmedicinename='" + salmedicinename + '\'' +
                ", salamount='" + salamount + '\'' +
                ", salprice='" + salprice + '\'' +
                ", saldate=" + saldate +
                ", salname='" + salname + '\'' +
                '}';
    }
}