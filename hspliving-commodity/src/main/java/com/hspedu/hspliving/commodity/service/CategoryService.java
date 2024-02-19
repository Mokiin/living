package com.hspedu.hspliving.commodity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hspedu.common.utils.PageUtils;
import com.hspedu.hspliving.commodity.entity.CategoryEntity;
import com.hspedu.hspliving.commodity.vo.Catalog2Vo;

import java.util.List;
import java.util.Map;


public interface CategoryService extends IService<CategoryEntity> {

    //返回所有分类及其子分类(带有层级关系-即树形!)
    List<CategoryEntity> listTree();
    PageUtils queryPage(Map<String, Object> params);

    //增加接口，返回cascadedCategoryId数组，数据的形式[1,21,301]
    Long[] getCascadedCategoryId(Long categroyId);

    //获取一级分类
    List<CategoryEntity> getLevel1Categories();

    //返回二级分类(包括三级分类)的数据-按照规定的格式
    Map<String,List<Catalog2Vo>> getCatalogJson();
}

