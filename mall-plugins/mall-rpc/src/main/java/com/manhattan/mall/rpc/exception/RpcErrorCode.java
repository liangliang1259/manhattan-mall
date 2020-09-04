package com.manhattan.mall.rpc.exception;

import com.manhattan.mall.common.exception.ErrorCode;

/**
 * @Description: TODO
 * @Author: Leon Sun
 * @Date: 2020/9/3
 */
public enum RpcErrorCode implements ErrorCode {
  PAY_FAILURE(3001, "支付失败"),;

  RpcErrorCode(int code, String message) {
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
