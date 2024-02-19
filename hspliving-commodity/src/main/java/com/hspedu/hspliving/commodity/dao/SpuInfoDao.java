package com.hspedu.hspliving.commodity.dao;

import com.hspedu.hspliving.commodity.entity.SpuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {

    //方法: 修改spu的发布状态
    void updateSpuStatus(@Param("spuId") Long spuId, @Param("statusCode") int statusCode);
}
