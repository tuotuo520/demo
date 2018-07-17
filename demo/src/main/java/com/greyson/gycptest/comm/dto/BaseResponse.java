package com.greyson.gycptest.comm.dto;

/**
 * 
 * //TODO 公共响应类
 * @author Greyson
 */
public class BaseResponse {
    
    public BaseResponse(Object content) {
        this.content = content;
    }
    private Object content;
    
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }
}
