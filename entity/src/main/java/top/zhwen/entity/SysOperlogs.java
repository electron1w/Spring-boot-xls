package top.zhwen.entity;

import java.util.Date;

public class SysOperlogs {

	/**
	 * 主键id
	 */
	private Long id;

	/**
	 * 操作人
	 */
	private String loginname;

	/**
	 * 操作时间
	 */
	private Date opertime;

	/**
	 * 内容 当type2用|分割,
	 */
	private String content;

	/**
	 * 操作ip
	 */
	private String ip;

	/**
	 * 0为系统管理员操作,1为用户操作,2用户订单操作 当type=2时orderId必须有值
	 */
	private Long types;

	/**
	 * 产品id 产品表的id字段
	 */
	private Long orderid;

	/**
	 * 获取主键id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * 设置主键id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取操作人
	 */
	public String getLoginname() {
		return this.loginname;
	}

	/**
	 * 设置操作人
	 */
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	/**
	 * 获取操作时间
	 */
	public Date getOpertime() {
		return this.opertime;
	}

	/**
	 * 设置操作时间
	 */
	public void setOpertime(Date opertime) {
		this.opertime = opertime;
	}

	/**
	 * 获取内容 当type2用|分割,
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 * 设置内容 当type2用|分割,
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 获取操作ip
	 */
	public String getIp() {
		return this.ip;
	}

	/**
	 * 设置操作ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * 获取0为系统管理员操作,1为用户操作,2用户订单操作 当type=2时orderId必须有值
	 */
	public Long getTypes() {
		return this.types;
	}

	/**
	 * 设置0为系统管理员操作,1为用户操作,2用户订单操作 当type=2时orderId必须有值
	 */
	public void setTypes(Long types) {
		this.types = types;
	}

	/**
	 * 获取产品id 产品表的id字段
	 */
	public Long getOrderid() {
		return this.orderid;
	}

	/**
	 * 设置产品id 产品表的id字段
	 */
	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

}
