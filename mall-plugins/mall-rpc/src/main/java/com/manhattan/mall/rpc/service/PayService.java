package com.manhattan.mall.rpc.service;

/**
 * @Description: TODO
 * @Author: Leon Sun
 * @Date: 2020/9/3
 */
public interface PayService {
  boolean pay(Long userAccountId,Double amount);
}
