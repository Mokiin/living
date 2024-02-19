package com.hspedu.hspliving.commodity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hspedu.common.utils.PageUtils;
import com.hspedu.hspliving.commodity.entity.SkuInfoEntity;
import com.hspedu.hspliving.commodity.vo.SearchResult;

import java.util.Map;


public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    //保存SKU的基本信息
    void saveSkuInfo(SkuInfoEntity skuInfoEntity);

    //进行分页查询-携带相应的检索条件
    PageUtils queryPageByCondition(Map<String, Object> params);

    //返回购买用户检索的结果 PageUtils -> SearchResult
    SearchResult querySearchPageByCondition(Map<String, Object> params);
}

