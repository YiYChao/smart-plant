package top.aiplant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aiplant.entity.TbPump;
import top.aiplant.entity.TbPumpExample;

public interface TbPumpMapper {
    long countByExample(TbPumpExample example);

    int deleteByExample(TbPumpExample example);

    int insert(TbPump record);

    int insertSelective(TbPump record);

    List<TbPump> selectByExample(TbPumpExample example);

    int updateByExampleSelective(@Param("record") TbPump record, @Param("example") TbPumpExample example);

    int updateByExample(@Param("record") TbPump record, @Param("example") TbPumpExample example);
    
    List<TbPump> selectPagerBySensorId(@Param("sensorId")int sensorId, @Param("page")int page, @Param("limit")int limit);
    
    int selectTotleCount(@Param("sensorId")int sensorId);
}