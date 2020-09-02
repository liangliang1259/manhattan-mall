package com.manhattan.mall.common.exception;

/**
 * @Description: 参数异常
 * @Author: Leon Sun
 * @Date: 2020/8/18
 */
public class ArgumentException extends java.lang.IllegalArgumentException {

  protected ErrorCode errorCode;

  public ArgumentException(ErrorCode errorCode) {
    super(formatMsg(errorCode));
    this.errorCode = errorCode;
  }

  public ErrorCode getErrorCode() {
    return this.errorCode;
  }

  public final static String formatMsg(ErrorCode errorCode) {
    return String.format("%s:%s", errorCode.getCode(), errorCode.getMessage());
  }
}