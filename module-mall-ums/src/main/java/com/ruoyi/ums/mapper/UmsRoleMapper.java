package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsRole;
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
public interface UmsRoleMapper extends BaseMapper<UmsRole> {
    int updateBatch(List<UmsRole> list);

    int updateBatchSelective(List<UmsRole> list);

    int batchInsert(@Param("list") List<UmsRole> list);

    int insertOrUpdate(UmsRole record);

    int insertOrUpdateSelective(UmsRole record);
}