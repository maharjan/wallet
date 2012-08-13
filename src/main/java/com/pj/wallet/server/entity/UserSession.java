package com.pj.wallet.server.entity;

import java.util.Date;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity(name = "USER_SESSION")
public class UserSession extends AbstractPersistable<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8756671405380245353L;

	private long userId;

	private String sessionId;

	private Date loggedIn;

	private Date loggedOut;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Date getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(Date loggedIn) {
		this.loggedIn = loggedIn;
	}

	public Date getLoggedOut() {
		return loggedOut;
	}

	public void setLoggedOut(Date loggedOut) {
		this.loggedOut = loggedOut;
	}

}
