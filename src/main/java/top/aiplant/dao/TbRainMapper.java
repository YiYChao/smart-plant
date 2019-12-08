package top.aiplant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aiplant.entity.TbRain;
import top.aiplant.entity.TbRainExample;

public interface TbRainMapper {
    long countByExample(TbRainExample example);

    int deleteByExample(TbRainExample example);

    int insert(TbRain record);

    int insertSelective(TbRain record);

    List<TbRain> selectByExample(TbRainExample example);

    int updateByExampleSelective(@Param("record") TbRain record, @Param("example") TbRainExample example);

    int updateByExample(@Param("record") TbRain record, @Param("example") TbRainExample example);
}