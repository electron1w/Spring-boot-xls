package top.zhwen.entity;

import java.util.Date;

public class Banners {

	/**
	 * 主键id
	 */
	private Long id;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 图片地址
	 */
	private String url;

	/**
	 * 链接地址
	 */
	private String link;

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

	/**
	 * 操作人
	 */
	private Long sysUserUid;

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
	 * 获取图片地址
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * 设置图片地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取链接地址
	 */
	public String getLink() {
		return this.link;
	}

	/**
	 * 设置链接地址
	 */
	public void setLink(String link) {
		this.link = link;
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

	/**
	 * 获取操作人
	 */
	public Long getSysUserUid() {
		return this.sysUserUid;
	}

	/**
	 * 设置操作人
	 */
	public void setSysUserUid(Long sysUserUid) {
		this.sysUserUid = sysUserUid;
	}

}
