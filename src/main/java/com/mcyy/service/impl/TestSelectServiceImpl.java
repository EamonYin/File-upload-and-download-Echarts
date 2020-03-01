package com.mcyy.service.impl;

//import com.mcyy.dao.mapper.testMapper;
//import com.mcyy.entity.User;
import com.mcyy.dao.mapper.ExcelMapper;
import com.mcyy.dao.mapper.SalesmessageMapper;
import com.mcyy.dao.mapper.UserMapper;
import com.mcyy.entity.*;
import com.mcyy.service.TestSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author XiaoMing
 * @create 2020/2/16 17:25
 * 测试用ServiceImpl
 */
@Service

public class TestSelectServiceImpl implements TestSelectService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    SalesmessageMapper salesmessageMapper;
    @Autowired
    ExcelMapper excelMapper;

    @Override
    public List<User> TestSelectSer() {
        UserExample userExample = new UserExample();
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<Salesmessage> SelectSalTest() {
        SalesmessageExample salesmessageExample = new SalesmessageExample();
        return salesmessageMapper.selectByExample(salesmessageExample);
    }
    //按日期分组，统计当天销售额
    @Override
    public List<Salesmessage> SumByDay() {
        return salesmessageMapper.SumByDay();
    }
    //早晨时段销量
    @Override
    public Integer MorningSell(String today) {
        return salesmessageMapper.MorningSell(today);
    }
    //中午时段销量
    @Override
    public Integer NoonSell(String noon) {
        return salesmessageMapper.NoonSell(noon);
    }
    //下午时段销量
    @Override
    public Integer AfternoonSell(String afternoon) {
        return salesmessageMapper.AfternoonSell(afternoon);
    }

    /*@Override
    public List<Salesmessage> SeleTime() {
        SalesmessageExample salesmessageExample = new SalesmessageExample();
        return salesmessageMapper.selectByExample(salesmessageExample);
    }*/

    @Override
    public List<String> SelectSaleTime() {
        return salesmessageMapper.SelectSaleTime();
    }

    //把Excel插入到数据库
    @Override
    public int InsertExcel(Excel record) {
        return excelMapper.insert(record);
    }

    @Override
    public List<Excel> ExcelIsNull(ExcelExample example) {
        return excelMapper.selectByExample(example);
    }

    @Override
    public int DeleteExcel() {
        return excelMapper.DeleteExcel();
    }


}

