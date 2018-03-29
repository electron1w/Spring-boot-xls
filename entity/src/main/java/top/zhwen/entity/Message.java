package top.zhwen.entity;

import java.util.Date;

public class Message {

	private Long id;

	/**
	 * 类型
	 */
	private String type;

	/**
	 * 是否已读
	 */
	private Long read;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 内容
	 */
	private String content;

	private String more;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 状态，0正常，1删除
	 */
	private Long active;

	private Long memberId;

	/**
	 * 操作人id
	 */
	private Long sysUserUid;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取类型
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * 设置类型
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获取是否已读
	 */
	public Long getRead() {
		return this.read;
	}

	/**
	 * 设置是否已读
	 */
	public void setRead(Long read) {
		this.read = read;
	}

	/**
	 * 获取标题
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * 设置标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 获取内容
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 * 设置内容
	 */
	public void setContent(String content) {
		this.content = content;
	}

	public String getMore() {
		return this.more;
	}

	public void setMore(String more) {
		this.more = more;
	}

	/**
	 * 获取创建时间
	 */
	public Date getCreateTime() {
		return this.createTime;
	}

	/**
	 * 设置创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取更新时间
	 */
	public Date getUpdateTime() {
		return this.updateTime;
	}

	/**
	 * 设置更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取状态，0正常，1删除
	 */
	public Long getActive() {
		return this.active;
	}

	/**
	 * 设置状态，0正常，1删除
	 */
	public void setActive(Long active) {
		this.active = active;
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	/**
	 * 获取操作人id
	 */
	public Long getSysUserUid() {
		return this.sysUserUid;
	}

	/**
	 * 设置操作人id
	 */
	public void setSysUserUid(Long sysUserUid) {
		this.sysUserUid = sysUserUid;
	}

}
