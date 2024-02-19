package com.hspedu.hspliving.commodity.vo;

import com.hspedu.hspliving.commodity.entity.SkuInfoEntity;
import lombok.Data;

import java.util.List;


@Data
public class SearchResult {

    //查询到所有的商品信息
    private List<SkuInfoEntity> commodity;

    //当前页码
    private Integer pageNum;

    //总的记录数
    private Long total;

    //共多少页-总的页码数
    private Integer totalPages;

    //分页导航条
    private List<Integer> pageNavs;

    //keyword
    private String keyword;
}
