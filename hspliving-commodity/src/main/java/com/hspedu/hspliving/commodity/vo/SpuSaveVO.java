/**
  * Copyright 2021 json.cn
  */
package com.hspedu.hspliving.commodity.vo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Data
public class SpuSaveVO {

    private String spuName;
    private String spuDescription;
    private Long catalogId;
    private Long brandId;
    private BigDecimal weight;
    private int publishStatus;
    private List<String> decript;
    private List<String> images;
    private Bounds bounds;
    private List<BaseAttrs> baseAttrs;
    private List<Skus> skus;


}
