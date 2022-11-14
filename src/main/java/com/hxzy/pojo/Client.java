package com.hxzy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @BelongsProject: market_management_system
 * @BelongsPackage: com.hxzy.pojo
 * @Author: fsh
 * @CreateTime: 2022-11-13  17:35
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    /**
     * 客户id
     */
    private Integer clientId;

    /**
     * 客户姓名
     */
    private String clientName;

    /**
     * 客户性别
     */
    private String clientSex;

    /**
     * 客户年龄
     */
    private Integer clientAge;

    /**
     * 客户生日
     */
    private Date clientBirthday;

    /**
     * 客户电话
     */
    private String clientPhone;

    /**
     * 客户住址
     */
    private String clientAddress;
}


