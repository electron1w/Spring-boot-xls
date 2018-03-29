package top.zhwen.entity;


public class Spread {

	private Long sysUserUid;

	private Long memberId;

	/**
	 * '组名'
	 */
	private String name;

	/**
	 * '分组类型'
	 */
	private String type;

	public Long getSysUserUid() {
		return this.sysUserUid;
	}

	public void setSysUserUid(Long sysUserUid) {
		this.sysUserUid = sysUserUid;
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	/**
	 * 获取'组名'
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 设置'组名'
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取'分组类型'
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * 设置'分组类型'
	 */
	public void setType(String type) {
		this.type = type;
	}

}
