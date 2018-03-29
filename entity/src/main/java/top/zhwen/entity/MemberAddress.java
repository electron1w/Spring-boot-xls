package top.zhwen.entity;


public class MemberAddress {

	private Long memberId;

	/**
	 * 收件人
	 */
	private String consignee;

	/**
	 * 收件人手机号码
	 */
	private String phoneNumber;

	/**
	 * 收件人地址
	 */
	private String pickupAddress;

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	/**
	 * 获取收件人
	 */
	public String getConsignee() {
		return this.consignee;
	}

	/**
	 * 设置收件人
	 */
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	/**
	 * 获取收件人手机号码
	 */
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	/**
	 * 设置收件人手机号码
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 获取收件人地址
	 */
	public String getPickupAddress() {
		return this.pickupAddress;
	}

	/**
	 * 设置收件人地址
	 */
	public void setPickupAddress(String pickupAddress) {
		this.pickupAddress = pickupAddress;
	}

}
