package top.zhwen.entity;

import java.util.Date;

public class MemberBrowsingHistory {

	private Long memberId;

	/**
	 * 时间
	 */
	private Date time;

	private Long goodsId;

	/**
	 * 可作为搜索记录
	 */
	private String msg;

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	/**
	 * 获取时间
	 */
	public Date getTime() {
		return this.time;
	}

	/**
	 * 设置时间
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	public Long getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * 获取可作为搜索记录
	 */
	public String getMsg() {
		return this.msg;
	}

	/**
	 * 设置可作为搜索记录
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
