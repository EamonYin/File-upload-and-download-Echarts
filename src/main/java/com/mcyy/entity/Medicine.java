package com.mcyy.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Medicine {
    private Integer mId;

    private Integer mMedicineid;

    private String mName;

    private String mState;

    private BigDecimal mPrice;

    private Integer mInventory;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
    private Date mPastdate;

    private String mClassify;

    private String mRemark;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getmMedicineid() {
        return mMedicineid;
    }

    public void setmMedicineid(Integer mMedicineid) {
        this.mMedicineid = mMedicineid;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmState() {
        return mState;
    }

    public void setmState(String mState) {
        this.mState = mState == null ? null : mState.trim();
    }

    public BigDecimal getmPrice() {
        return mPrice;
    }

    public void setmPrice(BigDecimal mPrice) {
        this.mPrice = mPrice;
    }

    public Integer getmInventory() {
        return mInventory;
    }

    public void setmInventory(Integer mInventory) {
        this.mInventory = mInventory;
    }

    public Date getmPastdate() {
        return mPastdate;
    }

    public void setmPastdate(Date mPastdate) {
        this.mPastdate = mPastdate;
    }

    public String getmClassify() {
        return mClassify;
    }

    public void setmClassify(String mClassify) {
        this.mClassify = mClassify == null ? null : mClassify.trim();
    }

    public String getmRemark() {
        return mRemark;
    }

    public void setmRemark(String mRemark) {
        this.mRemark = mRemark == null ? null : mRemark.trim();
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "mId=" + mId +
                ", mMedicineid=" + mMedicineid +
                ", mName='" + mName + '\'' +
                ", mState='" + mState + '\'' +
                ", mPrice=" + mPrice +
                ", mInventory=" + mInventory +
                ", mPastdate=" + mPastdate +
                ", mClassify='" + mClassify + '\'' +
                ", mRemark='" + mRemark + '\'' +
                '}';
    }
}