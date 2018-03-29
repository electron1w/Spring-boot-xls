package top.zhwen.entity;


public class MemberCurrency {

	private Long memberId;

	/**
	 * 预存余额
	 */
	private Double balance;

	/**
	 * 会员积分
	 */
	private Double membersPoint;

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	/**
	 * 获取预存余额
	 */
	public Double getBalance() {
		return this.balance;
	}

	/**
	 * 设置预存余额
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	/**
	 * 获取会员积分
	 */
	public Double getMembersPoint() {
		return this.membersPoint;
	}

	/**
	 * 设置会员积分
	 */
	public void setMembersPoint(Double membersPoint) {
		this.membersPoint = membersPoint;
	}

}
