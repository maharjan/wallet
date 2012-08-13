package com.pj.wallet.server.api.impl;

import java.util.Date;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import com.pj.wallet.server.api.UserRegistrationApi;
import com.pj.wallet.server.auth.Authorities;
import com.pj.wallet.server.entity.User;
import com.pj.wallet.server.exception.ClientException;
import com.pj.wallet.server.repository.UserRepository;
import com.pj.wallet.server.web.model.RegistrationModel;

public class UserRegistrationImpl implements UserRegistrationApi {
	private UserRepository userRepository;
	private PasswordEncoder encoder;

	public UserRegistrationImpl(PasswordEncoder encoder, UserRepository userRepository) {
		this.encoder = encoder;
		this.userRepository = userRepository;
	}

	@Override
	@Transactional
	public void registerUser(RegistrationModel model) throws ClientException {
		if (userRepository.findByUserName(model.getUsername()) != null) {
			throw new ClientException("user.already.exists");
		}
		User user = new User();
		user.setAuthority(Authorities.ROLE_USER);
		user.setCreated(new Date());
		user.setDisabled(false);
		user.setDeleted(false);
		user.setUserName(model.getUsername());
		user.setPassword(encoder.encode(model.getPassword()));
		userRepository.save(user);
	}
}
