package com.ruoyi.pms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.pms.mapper.PmsAlbumMapper;
import com.ruoyi.pms.domain.PmsAlbum;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsAlbumService extends ServiceImpl<PmsAlbumMapper, PmsAlbum> {

    
    public int updateBatch(List<PmsAlbum> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<PmsAlbum> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<PmsAlbum> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(PmsAlbum record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(PmsAlbum record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
