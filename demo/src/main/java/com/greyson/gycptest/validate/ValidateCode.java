/*
 * 
 * 
 * 项目名称 : demo
 * 创建日期 : 2018年7月18日
 * 修改历史 : 
 *     1. [2018年7月18日]创建文件 by Greyson
 */
package com.greyson.gycptest.validate;

import java.time.LocalDateTime;

/**
 * //TODO 验证码实体类
 * @author Greyson
 */
public class ValidateCode {
    private String code;

    private LocalDateTime expireTime;

    public ValidateCode(String code, LocalDateTime expireTime) {
        super();
        this.code = code;
        this.expireTime = expireTime;
    }
    
    public ValidateCode(String code, int expireIn){
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
    }
    /**
     * 
     * //TODO是否过期
     * @return
     */
    public boolean isExpried() {
        return LocalDateTime.now().isAfter(getExpireTime());
    }
}
