package top.zhwen.entity;

import java.util.Date;

public class MemberFundingDetails {

	private Long memberId;

	/**
	 * 更新的字段
	 */
	private String updatedFields;

	/**
	 * 更新前属性
	 */
	private Double beforeUpp;

	/**
	 * 更新后属性
	 */
	private Double afterUpp;

	/**
	 * 修改时间
	 */
	private Date uppTime;

	/**
	 * 操作人
	 */
	private String operator;

	/**
	 * 更新原因
	 */
	private String uppMsg;

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	/**
	 * 获取更新的字段
	 */
	public String getUpdatedFields() {
		return this.updatedFields;
	}

	/**
	 * 设置更新的字段
	 */
	public void setUpdatedFields(String updatedFields) {
		this.updatedFields = updatedFields;
	}

	/**
	 * 获取更新前属性
	 */
	public Double getBeforeUpp() {
		return this.beforeUpp;
	}

	/**
	 * 设置更新前属性
	 */
	public void setBeforeUpp(Double beforeUpp) {
		this.beforeUpp = beforeUpp;
	}

	/**
	 * 获取更新后属性
	 */
	public Double getAfterUpp() {
		return this.afterUpp;
	}

	/**
	 * 设置更新后属性
	 */
	public void setAfterUpp(Double afterUpp) {
		this.afterUpp = afterUpp;
	}

	/**
	 * 获取修改时间
	 */
	public Date getUppTime() {
		return this.uppTime;
	}

	/**
	 * 设置修改时间
	 */
	public void setUppTime(Date uppTime) {
		this.uppTime = uppTime;
	}

	/**
	 * 获取操作人
	 */
	public String getOperator() {
		return this.operator;
	}

	/**
	 * 设置操作人
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * 获取更新原因
	 */
	public String getUppMsg() {
		return this.uppMsg;
	}

	/**
	 * 设置更新原因
	 */
	public void setUppMsg(String uppMsg) {
		this.uppMsg = uppMsg;
	}

}
