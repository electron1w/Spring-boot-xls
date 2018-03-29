package top.zhwen.entity;

import java.util.Date;

public class Order {

	private Long id;

	private Long memberId;

	/**
	 * 订单编号
	 */
	private String orderNumber;

	/**
	 * 支付订单
	 */
	private String payid;

	/**
	 * 价格
	 */
	private Double totlePrice;

	/**
	 * 订单状态0 ,1
	 */
	private Long status;

	/**
	 * 创建时间
	 */
	private Date createTime;

	private Long storeId;

	/**
	 * 0现场
1邮寄

	 */
	private Long pickUpType;

	/**
	 * pick up type == 1 需要地址
	 */
	private String address;

	/**
	 * pick up type == 1 出现  邮费
	 */
	private Double postage;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	/**
	 * 获取订单编号
	 */
	public String getOrderNumber() {
		return this.orderNumber;
	}

	/**
	 * 设置订单编号
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * 获取支付订单
	 */
	public String getPayid() {
		return this.payid;
	}

	/**
	 * 设置支付订单
	 */
	public void setPayid(String payid) {
		this.payid = payid;
	}

	/**
	 * 获取价格
	 */
	public Double getTotlePrice() {
		return this.totlePrice;
	}

	/**
	 * 设置价格
	 */
	public void setTotlePrice(Double totlePrice) {
		this.totlePrice = totlePrice;
	}

	/**
	 * 获取订单状态0 ,1
	 */
	public Long getStatus() {
		return this.status;
	}

	/**
	 * 设置订单状态0 ,1
	 */
	public void setStatus(Long status) {
		this.status = status;
	}

	/**
	 * 获取创建时间
	 */
	public Date getCreateTime() {
		return this.createTime;
	}

	/**
	 * 设置创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	/**
	 * 获取0现场
1邮寄

	 */
	public Long getPickUpType() {
		return this.pickUpType;
	}

	/**
	 * 设置0现场
1邮寄

	 */
	public void setPickUpType(Long pickUpType) {
		this.pickUpType = pickUpType;
	}

	/**
	 * 获取pick up type == 1 需要地址
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * 设置pick up type == 1 需要地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 获取pick up type == 1 出现  邮费
	 */
	public Double getPostage() {
		return this.postage;
	}

	/**
	 * 设置pick up type == 1 出现  邮费
	 */
	public void setPostage(Double postage) {
		this.postage = postage;
	}

}
