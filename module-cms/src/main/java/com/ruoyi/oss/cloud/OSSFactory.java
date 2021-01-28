/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.ruoyi.oss.cloud;


import com.ruoyi.oss.cloud.provider.AliyunCloudStorageService;
import com.ruoyi.oss.cloud.provider.QcloudCloudStorageService;
import com.ruoyi.oss.cloud.provider.QiniuCloudStorageService;
import com.ruoyi.oss.constant.OssConstant;
import com.ruoyi.oss.constant.StorageConstant;
import com.ruoyi.oss.service.OssConfigService;
import com.ruoyi.oss.util.SpringContextUtils;

/**
 * 文件上传Factory
 *
 * @author Mark sunlightcs@gmail.com
 */
public final class OSSFactory {
    private static OssConfigService ossConfigService;

    static {
        ossConfigService = (OssConfigService) SpringContextUtils.getBean("OssConfigService");
    }

    public static CloudStorageService build() {
        //获取云存储配置信息
        CloudStorageConfig config = ossConfigService.getConfigObject(StorageConstant.CLOUD_STORAGE_CONFIG_KEY, CloudStorageConfig.class);

        if (config.getType() == OssConstant.CloudService.QINIU.getValue()) {
            return new QiniuCloudStorageService(config);
        } else if (config.getType() == OssConstant.CloudService.ALIYUN.getValue()) {
            return new AliyunCloudStorageService(config);
        } else if (config.getType() == OssConstant.CloudService.QCLOUD.getValue()) {
            return new QcloudCloudStorageService(config);
        }

        return null;
    }

}
