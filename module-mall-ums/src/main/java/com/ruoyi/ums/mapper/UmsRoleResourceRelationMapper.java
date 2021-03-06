package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsRoleResourceRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Mapper
public interface UmsRoleResourceRelationMapper extends BaseMapper<UmsRoleResourceRelation> {
    int updateBatch(List<UmsRoleResourceRelation> list);

    int updateBatchSelective(List<UmsRoleResourceRelation> list);

    int batchInsert(@Param("list") List<UmsRoleResourceRelation> list);

    int insertOrUpdate(UmsRoleResourceRelation record);

    int insertOrUpdateSelective(UmsRoleResourceRelation record);
}
