package com.manhattan.mall.api.controller;

import com.manhattan.mall.api.exception.ApiErrorCode;
import com.manhattan.mall.api.service.OrderService;
import com.manhattan.mall.common.exception.BusinessException;
import com.manhattan.mall.common.rest.RestResult;
import com.manhattan.mall.common.rest.RestResultBuilder;
import com.manhattan.mall.core.domain.order.OrderInfoDTO;
import com.manhattan.mall.core.domain.order.OrderInfoVO;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: api订单处理流程
 * @Author: Leon Sun
 * @Date: 2020/9/2
 */
@Slf4j
@RequestMapping("/api/orders")
@RestController
public class OrderController {
  @Autowired
  private OrderService orderService;
  @PostMapping("/")
  public RestResult create(@RequestBody OrderInfoDTO orderInfoDTO){
    log.info(">> request param = {}",orderInfoDTO.toString());
    this.checkParam(orderInfoDTO);
    boolean result = orderService.create(orderInfoDTO);
    if (!result){
      return RestResultBuilder.builder().failure().build();
    }
    return RestResultBuilder.builder().success().build();
  }

  @GetMapping("/")
  public RestResult list(@RequestBody OrderInfoDTO orderInfoDTO){

    this.checkParam(orderInfoDTO);
    List<OrderInfoVO> infoVOList = orderService.list(orderInfoDTO);
    return RestResultBuilder.builder().success().data(infoVOList).build();
  }

  @GetMapping("/{id}")
  public RestResult get(@PathVariable("id")Long id){
    OrderInfoVO orderInfoVO = orderService.getById(id);
    return RestResultBuilder.builder().success().data(orderInfoVO).build();
  }

  @PutMapping("/{id}")
  public RestResult update(@PathVariable("id")Long id,@RequestBody OrderInfoDTO orderInfoDTO){

    return RestResultBuilder.builder().success().build();
  }


  private void checkParam(OrderInfoDTO orderInfoDTO) {
    if (orderInfoDTO.getUserAccountId() == null){
      throw new BusinessException(ApiErrorCode.ACCOUNT_CANNOT_NULL);
    }
  }

}
