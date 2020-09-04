package com.manhattan.mall.core.domain.order;

import com.manhattan.mall.core.domain.BaseEntity;
import java.util.Date;
import lombok.Data;

/**
 * @Description: TODO
 * @Author: Leon Sun
 * @Date: 2020/9/2
 */
@Data
public class OrderInfoDO extends BaseEntity {

	/**
	 * id
	 */
	private Long id;
	/**
	 * 订单编号
	 */
	private String orderNo;
	/**
	 * 用户账号id
	 */
	private Long userAccountId;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 订单状态
	 */
	private Integer orderStatus;
	/**
	 * 收货人
	 */
	private String consignee;
	/**
	 * 收货地址
	 */
	private String deliveryAddress;
	/**
	 * 收货人手机号码
	 */
	private String consigneeCellPhoneNumber;
	/**
	 * 运费
	 */
	private Double freight;
	/**
	 * 支付方式
	 */
	private Integer payType;
	/**
	 * 订单总金额
	 */
	private Double totalAmount;
	/**
	 * 促销活动减免金额
	 */
	private Double discountAmount;
	/**
	 * 优惠券减免金额
	 */
	private Double couponAmount;
	/**
	 * 应付金额
	 */
	private Double payableAmount;
	/**
	 * 发票抬头
	 */
	private String invoiceTitle;
	/**
	 * 纳税人识别号
	 */
	private String taxpayerId;
	/**
	 * 订单备注
	 */
	private String orderComment;
	/**
	 * 是否发表了评论
	 */
	private Integer publishedComment;
	/**
	 * 确认收货时间
	 */
	private Date confirmReceiptTime;

	
}
