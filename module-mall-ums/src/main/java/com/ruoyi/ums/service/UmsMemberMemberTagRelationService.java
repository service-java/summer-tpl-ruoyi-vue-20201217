package com.ruoyi.ums.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.ums.domain.UmsMemberMemberTagRelation;
import com.ruoyi.ums.mapper.UmsMemberMemberTagRelationMapper;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsMemberMemberTagRelationService extends ServiceImpl<UmsMemberMemberTagRelationMapper, UmsMemberMemberTagRelation> {

    
    public int updateBatch(List<UmsMemberMemberTagRelation> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<UmsMemberMemberTagRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<UmsMemberMemberTagRelation> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(UmsMemberMemberTagRelation record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(UmsMemberMemberTagRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
