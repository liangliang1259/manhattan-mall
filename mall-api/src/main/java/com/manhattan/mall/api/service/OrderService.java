package com.manhattan.mall.api.service;

import com.manhattan.mall.core.domain.order.OrderInfoDTO;
import com.manhattan.mall.core.domain.order.OrderInfoVO;
import java.util.List;

/**
 * @Description: TODO
 * @Author: Leon Sun
 * @Date: 2020/9/2
 */
public interface OrderService {

	Boolean create(OrderInfoDTO orderInfoDTO);

	List<OrderInfoVO> list(OrderInfoDTO orderInfoDTO);

	OrderInfoVO getById(Long id);

	/**
	 * 通知订单中心，“商品完成发货”事件发生了
	 * @param orderId 订单id
	 * @return 处理结果
	 */
	Boolean informGoodsDeliveryFinishedEvent(Long orderId);
	
	/**
	 * 通知订单中心，“退货工单审核不通过”事件发生了
	 * @param orderId 订单id
	 * @return 处理结果
	 */
	Boolean informReturnGoodsWorksheetRejectedEvent(Long orderId);
	
	/**
	 * 通知订单中心，“退货工单审核通过”事件发生了
	 * @param orderId 订单id
	 * @return 处理结果
	 */
	Boolean informReturnGoodsWorsheetApprovedEvent(Long orderId);
	
	/**
	 * 通知订单中心，“确认收到退货商品”事件发生了
	 * @param orderId 订单id
	 * @return 处理结果
	 */
	Boolean informReturnGoodsReceivedEvent(Long orderId);
	
	/**
	 * 通知订单中心，“退货入库单审核通过”事件发生了
	 * @param orderId 订单id
	 * @return 处理结果
	 */
	Boolean informReturnGoodsInputOrderApprovedEvent(Long orderId);
	
	/**
	 * 通知订单中心，“完成退款”事件发生了
	 * @param orderId 订单id
	 * @return 处理结果
	 */
	Boolean informRefundFinishedEvent(Long orderId);
	
	/**
	 * 通知订单中心，“订单发表评论”事件发生了
	 * @param orderId 订单id
	 * @return 处理结果
	 */
	Boolean informPublishCommentEvent(Long orderId);

	/**
	 * 通知订单中心，“订单批量发表评论”事件发生了
	 * @param orderIds 订单id集合
	 * @return 处理结果
	 */
	Boolean informBatchPublishCommentEvent(List<Long> orderIds);
}
