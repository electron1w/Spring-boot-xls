package top.zhwen.entity;


public class StoreCoupon {

	private Long id;

	private Long storeId;

	/**
	 * 优惠券名字
	 */
	private String name;

	/**
	 * 优惠券描述
	 */
	private String detail;

	/**
	 * 优惠券类型
0为现金直减券
1为满减优惠券 
2为商品券 
3为送积分
4为满赠
	 */
	private Long type;

	/**
	 * 条件
type=0时 不检查
type=1时condition为 金额
type=2 ||4时condition为 orderid
	 */
	private String condition;

	/**
	 * 优惠券金额或者积分
	 */
	private Double money;

	/**
	 * 有效期(分)
	 */
	private Long validity;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	/**
	 * 获取优惠券名字
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 设置优惠券名字
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取优惠券描述
	 */
	public String getDetail() {
		return this.detail;
	}

	/**
	 * 设置优惠券描述
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * 获取优惠券类型
0为现金直减券
1为满减优惠券 
2为商品券 
3为送积分
4为满赠
	 */
	public Long getType() {
		return this.type;
	}

	/**
	 * 设置优惠券类型
0为现金直减券
1为满减优惠券 
2为商品券 
3为送积分
4为满赠
	 */
	public void setType(Long type) {
		this.type = type;
	}

	/**
	 * 获取条件
type=0时 不检查
type=1时condition为 金额
type=2 ||4时condition为 orderid
	 */
	public String getCondition() {
		return this.condition;
	}

	/**
	 * 设置条件
type=0时 不检查
type=1时condition为 金额
type=2 ||4时condition为 orderid
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

	/**
	 * 获取优惠券金额或者积分
	 */
	public Double getMoney() {
		return this.money;
	}

	/**
	 * 设置优惠券金额或者积分
	 */
	public void setMoney(Double money) {
		this.money = money;
	}

	/**
	 * 获取有效期(分)
	 */
	public Long getValidity() {
		return this.validity;
	}

	/**
	 * 设置有效期(分)
	 */
	public void setValidity(Long validity) {
		this.validity = validity;
	}

}
