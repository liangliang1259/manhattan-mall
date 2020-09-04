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
public class OrderItemVO extends BaseEntity {
	/**
	 * 订单id
	 */
	private Long orderInfoId;
	/**
	 * 商品id
	 */
	private Long goodsId;
	/**
	 * 商品sku id
	 */
	private Long goodsSkuId;
	/**
	 * 商品sku编号
	 */
	private String goodsSkuCode;
	/**
	 * 商品名称
	 */
	private String goodsName;
	/**
	 * 商品sku的销售属性
	 */
	private String saleProperties;
	/**
	 * 商品毛重
	 */
	private Double goodsGrossWeight;
	/**
	 * 商品sku的购买数量
	 */
	private Long purchaseQuantity;
	/**
	 * 商品sku的购买价格
	 */
	private Double purchasePrice;
	/**
	 * 商品sku使用的促销活动id
	 */
	private Long promotionActivityId;
	/**
	 * 商品长度
	 */
	private Double goodsLength;
	/**
	 * 商品宽度
	 */
	private Double goodsWidth;
	/**
	 * 商品高度
	 */
	private Double goodsHeight;

}
