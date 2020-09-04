package com.manhattan.mall.api.service.impl;

import com.manhattan.mall.api.exception.ApiErrorCode;
import com.manhattan.mall.common.exception.BusinessException;
import com.manhattan.mall.core.domain.order.OrderInfoDTO;
import com.manhattan.mall.api.service.OrderService;
import com.manhattan.mall.core.domain.order.OrderInfoVO;
import com.manhattan.mall.rpc.service.PayService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Author: Leon Sun
 * @Date: 2020/9/3
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {
  @Autowired
  private PayService payService;
  @Override
  public Boolean create(OrderInfoDTO orderInfoDTO) {
    //1.检查库存
    checkInventory(orderInfoDTO);
    //2.保持订单数据，生成订单id,订单状态为待付款
    saveOrder(orderInfoDTO);
    //3.锁库存，库存减少
    lockInventory(orderInfoDTO);
    //4.保存操作记录类型生成订单
    saveOperateLog(orderInfoDTO);
    //5.调用支付RPC
    doPay(orderInfoDTO);
    return Boolean.TRUE;
  }


  private void lockInventory(OrderInfoDTO orderInfoDTO) {
    log.info(">>>锁定库存");
  }

  private void saveOperateLog(OrderInfoDTO orderInfoDTO) {
    log.info(">>>保存操作记录");
  }

  private void saveOrder(OrderInfoDTO orderInfoDTO) {
    log.info(">>>存储订单信息");
    //1.数据转换及赋值
    //2.数据入库
  }

  private void checkInventory(OrderInfoDTO orderInfoDTO) {
    //库存检查
    if (orderInfoDTO.getQuantity()>2){
      throw new BusinessException(ApiErrorCode.SHORT_OF_INVENTORY);
    }
  }
  private void doPay(OrderInfoDTO orderInfoDTO) {
    log.info(">>>doPay:userAccountId = {},amount = {}",orderInfoDTO.getUserAccountId(),orderInfoDTO.getTotalAmount());
    payService.pay(orderInfoDTO.getUserAccountId(),orderInfoDTO.getTotalAmount());
  }

  @Override
  public Boolean informGoodsDeliveryFinishedEvent(Long orderId) {
    return null;
  }

  @Override
  public Boolean informReturnGoodsWorksheetRejectedEvent(Long orderId) {
    return null;
  }

  @Override
  public Boolean informReturnGoodsWorsheetApprovedEvent(Long orderId) {
    return null;
  }

  @Override
  public Boolean informReturnGoodsReceivedEvent(Long orderId) {
    return null;
  }

  @Override
  public Boolean informReturnGoodsInputOrderApprovedEvent(Long orderId) {
    return null;
  }

  @Override
  public List<OrderInfoVO> list(OrderInfoDTO orderInfoDTO) {
    return null;
  }

  @Override
  public OrderInfoVO getById(Long id) {
    return null;
  }

  @Override
  public Boolean informRefundFinishedEvent(Long orderId) {
    return null;
  }

  @Override
  public Boolean informPublishCommentEvent(Long orderId) {
    return null;
  }

  @Override
  public Boolean informBatchPublishCommentEvent(List<Long> orderIds) {
    return null;
  }
}
