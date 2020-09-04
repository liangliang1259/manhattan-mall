package com.manhattan.mall.rpc.service.impl;

import com.manhattan.mall.common.exception.BusinessException;
import com.manhattan.mall.rpc.exception.RpcErrorCode;
import com.manhattan.mall.rpc.service.PayService;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Author: Leon Sun
 * @Date: 2020/9/3
 */
@Service
public class PayServiceImpl implements PayService {

  @Override
  public boolean pay(Long userId, Double amount) {
    if (userId == null || amount == null || userId == 0 || amount<=0){
      throw new BusinessException(RpcErrorCode.PAY_FAILURE);
    }
    return true;
  }
}
