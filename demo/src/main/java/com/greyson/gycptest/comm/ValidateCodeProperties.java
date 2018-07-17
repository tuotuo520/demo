/*
 * 项目名称 : demo 创建日期 : 2018年7月17日 修改历史 : 1. [2018年7月17日]创建文件 by Greyson
 */
package com.greyson.gycptest.comm;

/**
 * //TODO 验证码相关配置
 * 
 * @author Greyson
 */
public class ValidateCodeProperties {
    private ImageProperties image = new ImageProperties();

    private SmsCodeProperties sms = new SmsCodeProperties();

    public ImageProperties getImage() {
        return image;
    }

    public void setImage(ImageProperties image) {
        this.image = image;
    }

    public SmsCodeProperties getSms() {
        return sms;
    }

    public void setSms(SmsCodeProperties sms) {
        this.sms = sms;
    }

}
