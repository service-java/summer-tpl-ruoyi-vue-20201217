package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsMember;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Mapper
public interface UmsMemberMapper extends BaseMapper<UmsMember> {
    int updateBatch(List<UmsMember> list);

    int updateBatchSelective(List<UmsMember> list);

    int batchInsert(@Param("list") List<UmsMember> list);

    int insertOrUpdate(UmsMember record);

    int insertOrUpdateSelective(UmsMember record);
}