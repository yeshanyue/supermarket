package com.hxzy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: market_management_system
 * @BelongsPackage: com.hxzy.pojo
 * @Author: fsh
 * @CreateTime: 2022-11-13  17:36
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
    /**
     * 供应商id
     */
    private String supplierId;

    /**
     * 供应商名称
     */
    private String supplierName;

    /**
     * 供应商地址
     */
    private String businessAddress;

    /**
     * 收款账号
     */
    private String bankAccount;

    /**
     * 开户行
     */
    private String depositaryBank;

    /**
     * 公司电话
     */
    private String companyPhone;

    /**
     * 联系人
     */
    private String supplierContact;

    /**
     * 联系人电话
     */
    private String contactPhone;
}


