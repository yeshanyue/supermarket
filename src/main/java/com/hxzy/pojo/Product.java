package com.hxzy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @BelongsProject: market_management_system
 * @BelongsPackage: com.hxzy.pojo
 * @Author: fsh
 * @CreateTime: 2022-11-13  17:32
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    /**
     * 商品id
     */
    private Integer productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品类型
     */
    private String productType;

    /**
     * 商品单价
     */
    private BigDecimal productPrice;

    /**
     * 产地
     */
    private String productOrigin;

    /**
     * 商品库存
     */
    private Integer productInventoty;

    /**
     * 商品描述信息
     */
    private String productDescription;









}


