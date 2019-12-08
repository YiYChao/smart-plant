package top.aiplant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aiplant.entity.TbZone;
import top.aiplant.entity.TbZoneExample;

public interface TbZoneMapper {
    long countByExample(TbZoneExample example);

    int deleteByExample(TbZoneExample example);

    int insert(TbZone record);

    int insertSelective(TbZone record);

    List<TbZone> selectByExample(TbZoneExample example);

    int updateByExampleSelective(@Param("record") TbZone record, @Param("example") TbZoneExample example);

    int updateByExample(@Param("record") TbZone record, @Param("example") TbZoneExample example);
}