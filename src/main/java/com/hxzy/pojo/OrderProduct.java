package com.hxzy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @BelongsProject: market_management_system
 * @BelongsPackage: com.hxzy.pojo
 * @Author: fsh
 * @CreateTime: 2022-11-13  17:38
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderProduct {
    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 客户id
     */
    private Integer clientId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品数量
     */
    private Integer productCount;

    /**
     * 商品单价
     */
    private BigDecimal productPrice;

}


