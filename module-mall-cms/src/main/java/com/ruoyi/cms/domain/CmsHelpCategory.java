package com.ruoyi.cms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:14
 */

/**
 * 帮助分类表
 */
@ApiModel(value = "com-ruoyi-cms-domain-CmsHelpCategory")
@Data
@TableName(value = "cms_help_category")
public class CmsHelpCategory {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "`name`")
    @ApiModelProperty(value = "")
    private String name;

    /**
     * 分类图标
     */
    @TableField(value = "icon")
    @ApiModelProperty(value = "分类图标")
    private String icon;

    /**
     * 专题数量
     */
    @TableField(value = "help_count")
    @ApiModelProperty(value = "专题数量")
    private Integer helpCount;

    @TableField(value = "show_status")
    @ApiModelProperty(value = "")
    private Integer showStatus;

    @TableField(value = "sort")
    @ApiModelProperty(value = "")
    private Integer sort;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_ICON = "icon";

    public static final String COL_HELP_COUNT = "help_count";

    public static final String COL_SHOW_STATUS = "show_status";

    public static final String COL_SORT = "sort";
}