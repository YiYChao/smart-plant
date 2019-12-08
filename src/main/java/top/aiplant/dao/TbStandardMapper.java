package top.aiplant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aiplant.entity.TbStandard;
import top.aiplant.entity.TbStandardExample;

public interface TbStandardMapper {
    long countByExample(TbStandardExample example);

    int deleteByExample(TbStandardExample example);

    int insert(TbStandard record);

    int insertSelective(TbStandard record);

    List<TbStandard> selectByExample(TbStandardExample example);

    int updateByExampleSelective(@Param("record") TbStandard record, @Param("example") TbStandardExample example);

    int updateByExample(@Param("record") TbStandard record, @Param("example") TbStandardExample example);
}