/*
 * 
 * 
 * 项目名称 : demo
 * 创建日期 : 2018年7月19日
 * 修改历史 : 
 *     1. [2018年7月19日]创建文件 by Greyson
 */
package com.greyson.gycptest.validate;

import com.greyson.gycptest.comm.SecurityConstants;

/**
 * //TODO 验证码类型枚举
 * @author Greyson
 */
public enum ValidateCodeType {
    SMS{
        @Override
        public String getParamNameOnValidate() {
            return SecurityConstants.DEFAULT_PARAMETER_NAME_CODE_SMS;
        }
    },
    IMAGE {
        @Override
        public String getParamNameOnValidate() {
            return SecurityConstants.DEFAULT_PARAMETER_NAME_CODE_IMAGE;
        }
    };

    public abstract String getParamNameOnValidate();
}
