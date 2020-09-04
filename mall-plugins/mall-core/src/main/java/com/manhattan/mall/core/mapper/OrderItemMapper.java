package com.manhattan.mall.core.mapper;

import com.manhattan.mall.core.domain.order.OrderItemDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: TODO
 * @Author: Leon Sun
 * @Date: 2020/9/2
 */
@Mapper
public interface OrderItemMapper {
	/**
	 * 新增订单条目
	 * @param orderItem
	 */
	void insert(OrderItemDO orderItem);
	
}
