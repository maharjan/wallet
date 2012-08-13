package com.pj.wallet.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "USER")
public class User extends AbstractEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5654304838957029380L;

	@Column(unique = true, nullable = false)
	private String userName;

	private String password;

	private String authority;

	private boolean deleted;

	private boolean disabled;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

}
