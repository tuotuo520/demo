/**
 * 文 件 名: DatabaseContextHolder.java
 * 版    权:  Greyson. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  Greyson
 * 修改时间:  2018年6月29日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.greyson.gycptest.config;

/**
 * 多数据源一定要保证数据源的线程安全
 *
 * @author Greyson
 * @version  [SD V101R001, 2018年6月29日]
 *
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class DatabaseContextHolder {
    //用于存放多线程环境下的成员变量
    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<>();

    public static void setDatabaseType(DatabaseType type) {
        contextHolder.set(type);
    }

    public static DatabaseType getDatabaseType() {
        return contextHolder.get();
    }
}
