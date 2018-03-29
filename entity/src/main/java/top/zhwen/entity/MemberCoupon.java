package top.zhwen.entity;

import java.util.Date;

public class MemberCoupon {

	private Long memberId;

	private Long shopCouponId;

	/**
	 * 开始时间
	 */
	private Date startTime;

	/**
	 * 结束时间
	 */
	private Date endTime;

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getShopCouponId() {
		return this.shopCouponId;
	}

	public void setShopCouponId(Long shopCouponId) {
		this.shopCouponId = shopCouponId;
	}

	/**
	 * 获取开始时间
	 */
	public Date getStartTime() {
		return this.startTime;
	}

	/**
	 * 设置开始时间
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * 获取结束时间
	 */
	public Date getEndTime() {
		return this.endTime;
	}

	/**
	 * 设置结束时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
