package com.mcyy.service;

//import com.mcyy.entity.User;

import com.mcyy.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author XiaoMing
 * @create 2020/2/16 17:23
 * 测试用Service
 */
public interface TestSelectService {
    List<User> TestSelectSer();
    List<Salesmessage> SelectSalTest();
    //按日期分组，统计当天销售额
    List<Salesmessage> SumByDay();
    //早晨时段销量
    Integer MorningSell(String morning);
    //中午时段销量
    Integer NoonSell(String noon);
    //下午时段销量
    Integer AfternoonSell(String afternoon);
//    //查询所有时间
//    List<Salesmessage> SeleTime();
    //查询数据库时间
    List<String> SelectSaleTime();

    //把Excel插入到数据库
    int InsertExcel(Excel record);

    //查询数据库Excel表是不是有数据
    List<Excel> ExcelIsNull(ExcelExample example);

    //清空Excel表所有数据
    int DeleteExcel();
}
