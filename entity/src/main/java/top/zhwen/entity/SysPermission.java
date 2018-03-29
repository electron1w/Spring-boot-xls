package top.zhwen.entity;


public class SysPermission {

	private Long id;

	private Boolean available;

	private String name;

	private Long parentid;

	private String parentids;

	private String permission;

	private String resourcetype;

	private String url;

	/**
	 * 图标
	 */
	private String ico;

	/**
	 * 排序
	 */
	private Long sort;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean isAvailable() {
		return this.available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentid() {
		return this.parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}

	public String getParentids() {
		return this.parentids;
	}

	public void setParentids(String parentids) {
		this.parentids = parentids;
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getResourcetype() {
		return this.resourcetype;
	}

	public void setResourcetype(String resourcetype) {
		this.resourcetype = resourcetype;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取图标
	 */
	public String getIco() {
		return this.ico;
	}

	/**
	 * 设置图标
	 */
	public void setIco(String ico) {
		this.ico = ico;
	}

	/**
	 * 获取排序
	 */
	public Long getSort() {
		return this.sort;
	}

	/**
	 * 设置排序
	 */
	public void setSort(Long sort) {
		this.sort = sort;
	}

}
