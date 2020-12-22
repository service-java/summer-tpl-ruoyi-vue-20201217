package com.ruoyi.ums.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.ums.mapper.UmsRoleMenuRelationMapper;
import com.ruoyi.ums.domain.UmsRoleMenuRelation;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsRoleMenuRelationService extends ServiceImpl<UmsRoleMenuRelationMapper, UmsRoleMenuRelation> {

    
    public int updateBatch(List<UmsRoleMenuRelation> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<UmsRoleMenuRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<UmsRoleMenuRelation> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(UmsRoleMenuRelation record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(UmsRoleMenuRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
