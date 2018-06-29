package com.greyson.gycptest.config;
/**
 * 列出数据源类型
 *
 * @author Greyson
 * @version  [SD V101R001, 2018年6月29日]
 *
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public enum DatabaseType {
	master("write"), slave("read");
	
	DatabaseType(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DatabaseType{" +
                "name='" + name + '\'' +
                '}';
    }
}
