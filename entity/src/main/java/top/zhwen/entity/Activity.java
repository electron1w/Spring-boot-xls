package top.zhwen.entity;


public class Activity {

	private Long id;

	/**
	 * 活动名
	 */
	private String name;

	/**
	 * 活动详情
	 */
	private String detail;

	/**
	 * 有效时间(分)
	 */
	private Long validity;

	/**
	 * 排序
	 */
	private Long sort;

	/**
	 * 活动类型(区分系统活动或者商家活动)
	 */
	private Long type;

	/**
	 * 奖励(可为金额或者积分)
	 */
	private Double reward;

	private Long shopCouponId;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取活动名
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 设置活动名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取活动详情
	 */
	public String getDetail() {
		return this.detail;
	}

	/**
	 * 设置活动详情
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * 获取有效时间(分)
	 */
	public Long getValidity() {
		return this.validity;
	}

	/**
	 * 设置有效时间(分)
	 */
	public void setValidity(Long validity) {
		this.validity = validity;
	}

	/**
	 * 获取排序
	 */
	public Long getSort() {
		return this.sort;
	}

	/**
	 * 设置排序
	 */
	public void setSort(Long sort) {
		this.sort = sort;
	}

	/**
	 * 获取活动类型(区分系统活动或者商家活动)
	 */
	public Long getType() {
		return this.type;
	}

	/**
	 * 设置活动类型(区分系统活动或者商家活动)
	 */
	public void setType(Long type) {
		this.type = type;
	}

	/**
	 * 获取奖励(可为金额或者积分)
	 */
	public Double getReward() {
		return this.reward;
	}

	/**
	 * 设置奖励(可为金额或者积分)
	 */
	public void setReward(Double reward) {
		this.reward = reward;
	}

	public Long getShopCouponId() {
		return this.shopCouponId;
	}

	public void setShopCouponId(Long shopCouponId) {
		this.shopCouponId = shopCouponId;
	}

}
