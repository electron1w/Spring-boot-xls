package top.zhwen.entity;


public class OrderGoods {

	private Long id;

	private Long goodsId;

	private Long orderId;

	/**
	 * 价格
	 */
	private Double price;

	/**
	 * 数量
	 */
	private Long number;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * 获取价格
	 */
	public Double getPrice() {
		return this.price;
	}

	/**
	 * 设置价格
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * 获取数量
	 */
	public Long getNumber() {
		return this.number;
	}

	/**
	 * 设置数量
	 */
	public void setNumber(Long number) {
		this.number = number;
	}

}
