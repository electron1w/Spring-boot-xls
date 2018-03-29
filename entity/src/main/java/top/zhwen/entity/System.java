package top.zhwen.entity;


public class System {

	private Long id;

	/**
	 * '键'
	 */
	private String key;

	/**
	 * '值'
	 */
	private String value;

	/**
	 * '描述'
	 */
	private String description;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取'键'
	 */
	public String getKey() {
		return this.key;
	}

	/**
	 * 设置'键'
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * 获取'值'
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 * 设置'值'
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * 获取'描述'
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * 设置'描述'
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
