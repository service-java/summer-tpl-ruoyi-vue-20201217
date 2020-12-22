package com.ruoyi.sms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.sms.mapper.SmsFlashPromotionProductRelationMapper;
import com.ruoyi.sms.domain.SmsFlashPromotionProductRelation;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Service
public class SmsFlashPromotionProductRelationService extends ServiceImpl<SmsFlashPromotionProductRelationMapper, SmsFlashPromotionProductRelation> {

    
    public int updateBatch(List<SmsFlashPromotionProductRelation> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<SmsFlashPromotionProductRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<SmsFlashPromotionProductRelation> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(SmsFlashPromotionProductRelation record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(SmsFlashPromotionProductRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
