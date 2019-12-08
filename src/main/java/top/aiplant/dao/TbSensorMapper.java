package top.aiplant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aiplant.entity.TbSensor;
import top.aiplant.entity.TbSensorExample;

public interface TbSensorMapper {
    long countByExample(TbSensorExample example);

    int deleteByExample(TbSensorExample example);

    int insert(TbSensor record);

    int insertSelective(TbSensor record);

    List<TbSensor> selectByExample(TbSensorExample example);

    int updateByExampleSelective(@Param("record") TbSensor record, @Param("example") TbSensorExample example);

    int updateByExample(@Param("record") TbSensor record, @Param("example") TbSensorExample example);
}