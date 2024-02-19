package com.hspedu.hspliving.commodity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hspedu.common.utils.PageUtils;
import com.hspedu.hspliving.commodity.entity.SpuImagesEntity;

import java.util.List;
import java.util.Map;


public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);

    // 批量保存spu对应的图片集
    void saveImages(Long id, List<String> images);
}

