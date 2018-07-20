/*
 * 
 * 
 * 项目名称 : demo
 * 创建日期 : 2018年7月19日
 * 修改历史 : 
 *     1. [2018年7月19日]创建文件 by Greyson
 */
package com.greyson.gycptest.validate;

import org.springframework.security.core.AuthenticationException;

/**
 * //TODO 验证码异常处理类
 * @author Greyson
 */
public class ValidateCodeException extends AuthenticationException {

    /**
     * 
     */
    private static final long serialVersionUID = -7884322593954081245L;

    public ValidateCodeException(String msg) {
        super(msg);
        // TODO Auto-generated constructor stub
    }

}
