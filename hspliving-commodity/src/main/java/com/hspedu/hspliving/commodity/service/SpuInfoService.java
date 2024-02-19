package com.hspedu.hspliving.commodity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hspedu.common.utils.PageUtils;
import com.hspedu.hspliving.commodity.entity.SpuInfoEntity;
import com.hspedu.hspliving.commodity.vo.SpuSaveVO;

import java.util.Map;


public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVO spuSaveVO);

    void saveBaseSpuInfo(SpuInfoEntity spuInfoEntity);


    //通过携带的检索条件，进行分页查询
    PageUtils queryPageByCondition(Map<String, Object> params);

    //商品SPU上架
    void up(Long spuId);

    //商品SPU下架
    void down(Long spuId);
}

