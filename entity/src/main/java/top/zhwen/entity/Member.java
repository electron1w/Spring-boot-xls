package top.zhwen.entity;

import java.util.Date;

public class Member {

	/**
	 * 用户的唯一id
	 */
	private Long id;

	/**
	 * 登录名
	 */
	private String loginName;

	/**
	 * 登录密码
	 */
	private String passWord;

	/**
	 * 用户昵称
	 */
	private String nickName;

	/**
	 * 顾客手机号
	 */
	private String phoneNumber;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 年龄
	 */
	private Long age;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 获取用户的唯一id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * 设置用户的唯一id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取登录名
	 */
	public String getLoginName() {
		return this.loginName;
	}

	/**
	 * 设置登录名
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * 获取登录密码
	 */
	public String getPassWord() {
		return this.passWord;
	}

	/**
	 * 设置登录密码
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**
	 * 获取用户昵称
	 */
	public String getNickName() {
		return this.nickName;
	}

	/**
	 * 设置用户昵称
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * 获取顾客手机号
	 */
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	/**
	 * 设置顾客手机号
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 获取邮箱
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * 设置邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取年龄
	 */
	public Long getAge() {
		return this.age;
	}

	/**
	 * 设置年龄
	 */
	public void setAge(Long age) {
		this.age = age;
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

}
