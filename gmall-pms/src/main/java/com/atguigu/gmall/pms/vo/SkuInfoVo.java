package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.SkuInfoEntity;
import com.atguigu.gmall.pms.entity.SkuSaleAttrValueEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class SkuInfoVo extends SkuInfoEntity {

    // 积分相关字段
    private BigDecimal growBounds;
    private BigDecimal buyBounds;
    private List<Integer> work;
    // 打折相关字段
    private Integer fullCount;
    private BigDecimal discount;
    private Integer ladderAddOther;
    // 满减相关字段
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private Integer fullAddOther;
    // 销售属性
    private List<SkuSaleAttrValueEntity> saleAttrs;
    // sku图片
    private List<String> images;
}
