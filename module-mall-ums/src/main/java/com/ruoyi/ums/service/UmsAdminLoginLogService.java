package com.ruoyi.ums.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.mapper.UmsAdminLoginLogMapper;
import java.util.List;
import com.ruoyi.ums.domain.UmsAdminLoginLog;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsAdminLoginLogService extends ServiceImpl<UmsAdminLoginLogMapper, UmsAdminLoginLog> {

    
    public int updateBatch(List<UmsAdminLoginLog> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<UmsAdminLoginLog> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<UmsAdminLoginLog> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(UmsAdminLoginLog record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(UmsAdminLoginLog record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
