package com.pj.wallet.server.web.model;

import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;

public class RegistrationModel {

	@Email(message="Invalid email id")
	private String username;
	@Pattern(regexp="[a-zA-Z0-9]{6,20}", message="Must be alpha numeric only")
	private String password;
	@Pattern(regexp="[a-zA-Z0-9]{6,20}", message="Must be alpha numeric only")
	private String confirmPassword;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
