package com.hxzy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * @BelongsProject: market_management_system
 * @BelongsPackage: com.hxzy.pojo
 * @Author: fsh
 * @CreateTime: 2022-11-13  17:37
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {
    /**
     * 订单信息id
     */
    private Integer orderInfoId;

    /**
     * 商品单类数量
     */
    private Integer itemCount;

    /**
     * 客户id
     */
    private Integer clientId;

    /**
     * 支付方式
     */
    private String paymentMethod;

    /**
     * 支付时间
     */
    private Date paymentTime;

    /**
     * 总金额
     */
    private BigDecimal totalMerchandise;
}


