package com.mcyy.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;

import java.util.Date;

public class Excel {
    @ExcelProperty(value = "id", index = 0)
    private Integer id;
    @ExcelProperty(value = "药品名称" , index = 1)
    private String salmedicinename;
    @ExcelProperty(value = "销售件数", index = 2)
    private String salamount;
    @ExcelProperty(value ="药品价格" , index = 3)
    private String salprice;
    @DateTimeFormat("yyyy-MM-dd hh:mm:ss")
    @ExcelProperty(value ="销售日期" , index = 4)
    private Date saldate;
    @ExcelProperty(value = "用户名" , index = 5)
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