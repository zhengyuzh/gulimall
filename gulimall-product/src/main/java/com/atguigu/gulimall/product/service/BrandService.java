package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * Ʒ?
 *
 * @author zhengyuzhu
 * @email 2977429967@qq.com
 * @date 2023-02-25 23:11:31
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

