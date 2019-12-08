package top.aiplant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aiplant.entity.TbLed;
import top.aiplant.entity.TbLedExample;

public interface TbLedMapper {
    long countByExample(TbLedExample example);

    int deleteByExample(TbLedExample example);

    int insert(TbLed record);

    int insertSelective(TbLed record);

    List<TbLed> selectByExample(TbLedExample example);

    int updateByExampleSelective(@Param("record") TbLed record, @Param("example") TbLedExample example);

    int updateByExample(@Param("record") TbLed record, @Param("example") TbLedExample example);
}