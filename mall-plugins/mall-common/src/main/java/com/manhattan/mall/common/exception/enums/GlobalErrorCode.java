package com.manhattan.mall.common.exception.enums;

import com.manhattan.mall.common.exception.ErrorCode;

/**
 * @Description: 通用异常
 * @Author: Leon Sun
 * @Date: 2020/8/18
 */
public enum GlobalErrorCode implements ErrorCode {

  SUCCESS(1, "OK"),
  FAILURE(0, "Failure"),
  BAD_REQUEST(400, "Bad Request"),
  UNAUTHORIZED(401, "Unauthorized"),
  FORBIDDEN(403, "Forbidden"),
  NOT_FOUND(404, "Not Found"),
  METHOD_NOT_ALLOWED(405, "Method Not Allowed");

  GlobalErrorCode(int code, String message) {
    this.code = code;
    this.message = message;
  }

  private final int code;
  private final String message;

  @Override
  public int getCode() {
    return this.code;
  }

  @Override
  public String getMessage() {
    return this.message;
  }
}