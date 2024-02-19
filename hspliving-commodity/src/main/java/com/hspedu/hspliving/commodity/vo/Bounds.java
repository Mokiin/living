/**
  * Copyright 2021 json.cn
  */
package com.hspedu.hspliving.commodity.vo;

import lombok.Data;

import java.math.BigDecimal;



@Data
public class Bounds {
    //根据自己的业务来调整..
    private BigDecimal buyBounds;
    private BigDecimal growBounds;


}
