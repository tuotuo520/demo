/*
 * 
 * 
 * 项目名称 : demo
 * 创建日期 : 2018年7月18日
 * 修改历史 : 
 *     1. [2018年7月18日]创建文件 by Greyson
 */
package com.greyson.gycptest.validate;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * //TODO 验证码生成接口
 * @author Greyson
 */
public interface ValidateCodeGenerator {
    ValidateCode generate(ServletWebRequest request);
}
