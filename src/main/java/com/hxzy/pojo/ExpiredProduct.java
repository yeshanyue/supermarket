package com.hxzy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class ExpiredProduct {
    /**
     * 临期商品编号
     */
    private Integer epId;

    /**
     * 商品id
     */
    private Integer pId;

    /**
     * 商品名称
     */
    private String pName;

    /**
     * 上架时间
     */
    private Date createTime;

    /**
     * 生产日期
     */
    private Date prductionTime;

    /**
     * 过期时间
     */
    private Date warrantyExpirationTime;

    /**
     * 供应商
     */
    private String supplierName;

    /**
     * 进货数量
     */
    private Integer purchaseQuantity;

    /**
     * 售出数量
     */
    private Integer salesVolume;

    /**
     * 库存数量
     */
    private Integer inventoryQuantity;
}


