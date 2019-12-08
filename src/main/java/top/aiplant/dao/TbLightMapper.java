package top.aiplant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aiplant.entity.TbLight;
import top.aiplant.entity.TbLightExample;

public interface TbLightMapper {
    long countByExample(TbLightExample example);

    int deleteByExample(TbLightExample example);

    int insert(TbLight record);

    int insertSelective(TbLight record);

    List<TbLight> selectByExample(TbLightExample example);

    int updateByExampleSelective(@Param("record") TbLight record, @Param("example") TbLightExample example);

    int updateByExample(@Param("record") TbLight record, @Param("example") TbLightExample example);
}