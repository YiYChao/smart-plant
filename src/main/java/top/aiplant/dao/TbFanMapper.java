package top.aiplant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aiplant.entity.TbFan;
import top.aiplant.entity.TbFanExample;

public interface TbFanMapper {
    long countByExample(TbFanExample example);

    int deleteByExample(TbFanExample example);

    int insert(TbFan record);

    int insertSelective(TbFan record);

    List<TbFan> selectByExample(TbFanExample example);

    int updateByExampleSelective(@Param("record") TbFan record, @Param("example") TbFanExample example);

    int updateByExample(@Param("record") TbFan record, @Param("example") TbFanExample example);
}