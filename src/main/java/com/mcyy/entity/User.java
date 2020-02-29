package com.mcyy.entity;

public class User {
    private Integer uId;

    private String uUsername;

    private String uPassword;

    private Integer uLimit;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public Integer getuLimit() {
        return uLimit;
    }

    public void setuLimit(Integer uLimit) {
        this.uLimit = uLimit;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uUsername='" + uUsername + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uLimit=" + uLimit +
                '}';
    }
}