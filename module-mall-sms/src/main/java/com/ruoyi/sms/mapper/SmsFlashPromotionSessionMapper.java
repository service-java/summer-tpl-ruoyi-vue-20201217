package com.ruoyi.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sms.domain.SmsFlashPromotionSession;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Mapper
public interface SmsFlashPromotionSessionMapper extends BaseMapper<SmsFlashPromotionSession> {
    int updateBatch(List<SmsFlashPromotionSession> list);

    int updateBatchSelective(List<SmsFlashPromotionSession> list);

    int batchInsert(@Param("list") List<SmsFlashPromotionSession> list);

    int insertOrUpdate(SmsFlashPromotionSession record);

    int insertOrUpdateSelective(SmsFlashPromotionSession record);
}