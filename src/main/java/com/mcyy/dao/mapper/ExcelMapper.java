package com.mcyy.dao.mapper;

import com.mcyy.entity.Excel;
import com.mcyy.entity.ExcelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcelMapper {
    long countByExample(ExcelExample example);

    int deleteByExample(ExcelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Excel record);

    int insertSelective(Excel record);

    List<Excel> selectByExample(ExcelExample example);

    Excel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Excel record, @Param("example") ExcelExample example);

    int updateByExample(@Param("record") Excel record, @Param("example") ExcelExample example);

    int updateByPrimaryKeySelective(Excel record);

    int updateByPrimaryKey(Excel record);

    //清空Excel表
    int DeleteExcel();
}