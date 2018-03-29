package top.zhwen.entity;

import java.util.Date;

public class MemberSignIn {

	private Long id;

	private Long memberId;

	/**
	 * 最后一次签到时间
	 */
	private Date signInTime;

	/**
	 * 连续签到次数
	 */
	private Long frequency;

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
	 * 获取最后一次签到时间
	 */
	public Date getSignInTime() {
		return this.signInTime;
	}

	/**
	 * 设置最后一次签到时间
	 */
	public void setSignInTime(Date signInTime) {
		this.signInTime = signInTime;
	}

	/**
	 * 获取连续签到次数
	 */
	public Long getFrequency() {
		return this.frequency;
	}

	/**
	 * 设置连续签到次数
	 */
	public void setFrequency(Long frequency) {
		this.frequency = frequency;
	}

}
