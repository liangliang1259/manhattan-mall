package com.manhattan.mall.api.exception;

import com.manhattan.mall.common.exception.ErrorCode;

/**
 * @Description: TODO
 * @Author: Leon Sun
 * @Date: 2020/9/3
 */
public enum ApiErrorCode implements ErrorCode {
  SHORT_OF_INVENTORY(1001, "库存不足"),

  ACCOUNT_CANNOT_NULL(1002, "用户信息不能为空"),
  ;

  ApiErrorCode(int code, String message) {
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
