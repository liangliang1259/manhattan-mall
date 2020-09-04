package com.manhattan.mall.core.mapper;

import com.manhattan.mall.core.domain.order.OrderInfoDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: TODO
 * @Author: Leon Sun
 * @Date: 2020/9/2
 */
@Mapper
public interface OrderInfoDao {
  void insert(OrderInfoDO order);
}
