package top.aiplant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aiplant.entity.TbImg;
import top.aiplant.entity.TbImgExample;

public interface TbImgMapper {
    long countByExample(TbImgExample example);

    int deleteByExample(TbImgExample example);

    int insert(TbImg record);

    int insertSelective(TbImg record);

    List<TbImg> selectByExample(TbImgExample example);

    int updateByExampleSelective(@Param("record") TbImg record, @Param("example") TbImgExample example);

    int updateByExample(@Param("record") TbImg record, @Param("example") TbImgExample example);
}