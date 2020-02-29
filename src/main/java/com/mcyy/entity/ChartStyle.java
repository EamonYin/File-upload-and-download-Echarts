package com.mcyy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import sun.awt.SunHints;

import java.util.Date;

/**
 * @Author XiaoMing
 * @create 2020/2/24 14:40
 */
public class ChartStyle {
    public Integer value;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    public Date name;

    @Override
    public String toString() {
        return "ChartStyle{" +
                "value=" + value +
                ", name=" + name +
                '}';
    }

    public ChartStyle() {
    }

    public ChartStyle(Integer value, Date name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Date getName() {
        return name;
    }

    public void setName(Date name) {
        this.name = name;
    }
}
