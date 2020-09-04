package com.manhattan.mall.api.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import com.manhattan.mall.api.service.OrderService;
import com.manhattan.mall.core.domain.order.OrderInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class OrderServiceImplTest {
  @Autowired
  private OrderService orderService;

  @Test
  void create() {
    OrderInfoDTO orderInfoDTO = new OrderInfoDTO();
    orderInfoDTO.setUserAccountId(100l);
    orderService.create(orderInfoDTO);
  }
}