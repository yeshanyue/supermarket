package com.hxzy.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @BelongsProject: market_management_system
 * @BelongsPackage: com.hxzy.utils
 * @Author: fsh
 * @CreateTime: 2022-11-13  15:50
 * @Description: TODO
 * @Version: 1.0
 */
public class SqlSessionFactoryUtils {
   private static SqlSessionFactory factory;
    static {
         String resources= "mybatis-config.xml";
        InputStream rs = null;
        try {
            rs = Resources.getResourceAsStream(resources);
            factory = new SqlSessionFactoryBuilder().build(rs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getFactory() {
        return factory;
    }
}


