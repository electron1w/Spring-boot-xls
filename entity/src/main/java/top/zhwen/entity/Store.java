package top.zhwen.entity;


public class Store {

	private Long id;

	/**
	 * 门店名
	 */
	private String name;

	/**
	 * 地址
	 */
	private String address;

	private String number;

	private Long sysUserUid;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取门店名
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 设置门店名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取地址
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * 设置地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Long getSysUserUid() {
		return this.sysUserUid;
	}

	public void setSysUserUid(Long sysUserUid) {
		this.sysUserUid = sysUserUid;
	}

}
