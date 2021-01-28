package com.ruoyi.oss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.common.dto.PageQuery;
import com.ruoyi.oss.domain.OssBucket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 图书Mapper接口
 *
 * @author ruoyi
 * @date 2020-12-11
 */
@Mapper
public interface OssBucketMapper extends BaseMapper<OssBucket> {
    int deleteByPrimaryKey(Integer id);

    int insert(OssBucket record);

    int insertSelective(OssBucket record);

    OssBucket selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OssBucket record);

    int updateByPrimaryKey(OssBucket record);

    IPage<OssBucket> pageByXML(IPage<OssBucket> pageQuery, @Param("ossBucket") OssBucket ossBucket);
}
