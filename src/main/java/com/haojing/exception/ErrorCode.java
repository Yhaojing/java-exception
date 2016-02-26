package com.haojing.exception;

/**
 * Created by hnzb on 16/2/26.
 * 这是一个错误代码的实体类
 */
public class ErrorCode {
    private String errorCode;
    private String errorMsg;

    //因为有带参数构造函数,就省略了set...
    public ErrorCode(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }


    public String getErrorMsg() {
        return errorMsg;
    }

}
