package top.aiplant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aiplant.entity.TbSoil;
import top.aiplant.entity.TbSoilExample;

public interface TbSoilMapper {
    long countByExample(TbSoilExample example);

    int deleteByExample(TbSoilExample example);

    int insert(TbSoil record);

    int insertSelective(TbSoil record);

    List<TbSoil> selectByExample(TbSoilExample example);

    int updateByExampleSelective(@Param("record") TbSoil record, @Param("example") TbSoilExample example);

    int updateByExample(@Param("record") TbSoil record, @Param("example") TbSoilExample example);
}