package com.mcyy.dao.mapper;

import com.mcyy.entity.Salesmessage;
import com.mcyy.entity.SalesmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesmessageMapper {
    long countByExample(SalesmessageExample example);

    int deleteByExample(SalesmessageExample example);

    int deleteByPrimaryKey(Integer smId);

    int insert(Salesmessage record);

    int insertSelective(Salesmessage record);

    List<Salesmessage> selectByExample(SalesmessageExample example);

    Salesmessage selectByPrimaryKey(Integer smId);

    int updateByExampleSelective(@Param("record") Salesmessage record, @Param("example") SalesmessageExample example);

    int updateByExample(@Param("record") Salesmessage record, @Param("example") SalesmessageExample example);

    int updateByPrimaryKeySelective(Salesmessage record);

    int updateByPrimaryKey(Salesmessage record);

    //按日期分组，统计当天销售额
    List<Salesmessage> SumByDay();

    //早晨时段销量
    Integer MorningSell(@Param("morning") String Morning);

    //中午时段销量
    Integer NoonSell(@Param("noon") String noon);

    //下午时段销量
    Integer AfternoonSell(@Param("afternoon") String Afternoon);

    //查询数据库时间
    List<String> SelectSaleTime();

}