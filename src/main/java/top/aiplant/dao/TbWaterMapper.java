package top.aiplant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aiplant.entity.TbWater;
import top.aiplant.entity.TbWaterExample;

public interface TbWaterMapper {
    long countByExample(TbWaterExample example);

    int deleteByExample(TbWaterExample example);

    int insert(TbWater record);

    int insertSelective(TbWater record);

    List<TbWater> selectByExample(TbWaterExample example);

    int updateByExampleSelective(@Param("record") TbWater record, @Param("example") TbWaterExample example);

    int updateByExample(@Param("record") TbWater record, @Param("example") TbWaterExample example);
}