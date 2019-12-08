package top.aiplant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aiplant.entity.TbPlant;
import top.aiplant.entity.TbPlantExample;

public interface TbPlantMapper {
    long countByExample(TbPlantExample example);

    int deleteByExample(TbPlantExample example);

    int insert(TbPlant record);

    int insertSelective(TbPlant record);

    List<TbPlant> selectByExample(TbPlantExample example);

    int updateByExampleSelective(@Param("record") TbPlant record, @Param("example") TbPlantExample example);

    int updateByExample(@Param("record") TbPlant record, @Param("example") TbPlantExample example);
}