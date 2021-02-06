package com.ruoyi.crawler.mapper;


import com.ruoyi.crawler.database.SqlParam;
import com.ruoyi.crawler.domain.SysUserPost;
import org.beetl.sql.core.annotatoin.Sql;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

/**
 * 用户与岗位关联表 数据层
 *
 * @author ruoyi
 */
@SqlResource("SysUserPostMapper")
public interface SysUserPostMapper extends BaseMapper<SysUserPost> {
    /**
     * 通过用户ID删除用户和岗位关联
     *
     * @param userId 用户ID
     * @return 结果
     */
    @Sql("delete from sys_user_post where user_id = ?")
    public int deleteUserPostByUserId(Long userId);

    /**
     * 通过岗位ID查询岗位使用数量
     *
     * @param postId 岗位ID
     * @return 结果
     */
    @Sql("select count(1) from sys_user_post where post_id=?")
    public int countUserPostById(Long postId);

    /**
     * 批量删除用户和岗位关联
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public default int deleteUserPost(Long[] ids) {
        return this.executeUpdate("delete from sys_user_post where user_id in in (#join(ids)#)", SqlParam.create().set("ids", ids));
    }

    /**
     * 批量新增用户岗位信息
     *
     * @param userPostList 用户角色列表
     * @return 结果
     */
    public default int batchUserPost(List<SysUserPost> userPostList) {
        this.insertBatch(userPostList);
        return userPostList.size();
    }
}
