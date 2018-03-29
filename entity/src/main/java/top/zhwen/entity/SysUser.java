package top.zhwen.entity;


public class SysUser {

	private Long uid;

	private String name;

	private String username;

	private String password;

	private String salt;

	private Long state;

	private Long sysUserUid;

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Long getState() {
		return this.state;
	}

	public void setState(Long state) {
		this.state = state;
	}

	public Long getSysUserUid() {
		return this.sysUserUid;
	}

	public void setSysUserUid(Long sysUserUid) {
		this.sysUserUid = sysUserUid;
	}

}
