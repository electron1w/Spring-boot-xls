package top.zhwen.entity;

import java.util.Date;

public class Goods {

	/**
	 * 商品表
	 */
	private Long id;

	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 型号
	 */
	private String itemNo;

	/**
	 * 详情
	 */
	private String details;

	/**
	 * 库存
	 */
	private Long stock;

	/**
	 * 添加时间
	 */
	private Date createTime;

	/**
	 * 获取商品表
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * 设置商品表
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取商品名
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 设置商品名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取型号
	 */
	public String getItemNo() {
		return this.itemNo;
	}

	/**
	 * 设置型号
	 */
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	/**
	 * 获取详情
	 */
	public String getDetails() {
		return this.details;
	}

	/**
	 * 设置详情
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 * 获取库存
	 */
	public Long getStock() {
		return this.stock;
	}

	/**
	 * 设置库存
	 */
	public void setStock(Long stock) {
		this.stock = stock;
	}

	/**
	 * 获取添加时间
	 */
	public Date getCreateTime() {
		return this.createTime;
	}

	/**
	 * 设置添加时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
