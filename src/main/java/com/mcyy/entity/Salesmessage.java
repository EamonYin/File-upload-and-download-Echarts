package com.mcyy.entity;

import java.util.Date;

public class Salesmessage {
    private Integer smId;

    private Integer smMedicineid;

    private Integer smUserid;

    private Date smData;

    private Integer smInventory;

    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public Integer getSmMedicineid() {
        return smMedicineid;
    }

    public void setSmMedicineid(Integer smMedicineid) {
        this.smMedicineid = smMedicineid;
    }

    public Integer getSmUserid() {
        return smUserid;
    }

    public void setSmUserid(Integer smUserid) {
        this.smUserid = smUserid;
    }

    public Date getSmData() {
        return smData;
    }

    public void setSmData(Date smData) {
        this.smData = smData;
    }

    public Integer getSmInventory() {
        return smInventory;
    }

    public void setSmInventory(Integer smInventory) {
        this.smInventory = smInventory;
    }

    @Override
    public String toString() {
        return "Salesmessage{" +
                "smId=" + smId +
                ", smMedicineid=" + smMedicineid +
                ", smUserid=" + smUserid +
                ", smData=" + smData +
                ", smInventory=" + smInventory +
                '}';
    }
}