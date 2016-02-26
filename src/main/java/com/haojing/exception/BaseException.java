package com.haojing.exception;

/**
 * Created by hnzb on 16/2/26.
 * 异常基类
 */
public class BaseException extends RuntimeException{

    private ErrorCode errorCode;

    public BaseException(ErrorCode errorCode, Throwable cause) {
        super("Error Code:" + errorCode.getErrorCode() +",Error Msg:"+errorCode.getErrorMsg(), cause);
        this.errorCode = errorCode;
    }

    public BaseException(ErrorCode errorCode) {
        super("Error Code: "+ errorCode.getErrorCode()+", Error Msg: "+errorCode.getErrorMsg());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
/**
 * 抛出异常
 */
    public static void raise(ErrorCode errorCode, Throwable cause) {
        throw new BaseException(errorCode, cause);
    }
    public static void raise(ErrorCode errorCode) {
        throw new BaseException(errorCode);
    }
}
