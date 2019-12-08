package top.aiplant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aiplant.entity.TbDht;
import top.aiplant.entity.TbDhtExample;

public interface TbDhtMapper {
    long countByExample(TbDhtExample example);

    int deleteByExample(TbDhtExample example);

    int insert(TbDht record);

    int insertSelective(TbDht record);

    List<TbDht> selectByExample(TbDhtExample example);

    int updateByExampleSelective(@Param("record") TbDht record, @Param("example") TbDhtExample example);

    int updateByExample(@Param("record") TbDht record, @Param("example") TbDhtExample example);
}