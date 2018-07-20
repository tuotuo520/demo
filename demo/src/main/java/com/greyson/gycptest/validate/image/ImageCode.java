/*
 * 项目名称 : demo 创建日期 : 2018年7月18日 修改历史 : 1. [2018年7月18日]创建文件 by Greyson
 */
package com.greyson.gycptest.validate.image;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

import com.greyson.gycptest.validate.ValidateCode;

/**
 * //TODO 添加类/接口功能描述
 * 
 * @author Greyson
 */
public class ImageCode extends ValidateCode {
    private BufferedImage image;

    public ImageCode(BufferedImage image,String code, int expireIn) {
        super(code, expireIn);
        this.image = image;
    }

    public ImageCode(BufferedImage image, String code, LocalDateTime localDateTime) {
        super(code, localDateTime);
        this.image = image;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}
