package com.pj.wallet.server.api.impl;

import java.util.Date;

import org.springframework.transaction.annotation.Transactional;

import com.pj.wallet.server.api.UserSessionApi;
import com.pj.wallet.server.entity.UserSession;
import com.pj.wallet.server.repository.UserSessionRepository;


public class UserSessionImpl implements UserSessionApi {

	private final UserSessionRepository userSessionRepository;

	public UserSessionImpl(UserSessionRepository userSessionRepository) {
		this.userSessionRepository = userSessionRepository;
	}

	@Override
	@Transactional
	public void userLoggedIn(long userId, String sessionId) {
		UserSession s = new UserSession();
		s.setUserId(userId);
		s.setLoggedIn(new Date());
		s.setSessionId(sessionId);
		userSessionRepository.save(s);
	}

	@Override
	@Transactional
	public void userLoggedOut(long userId, String sessionId) {
		UserSession s = userSessionRepository
				.findUserSessionBySessionId(sessionId);
		if (s != null && s.getUserId() == userId) {
			s.setUserId(userId);
			s.setLoggedOut(new Date());
			s.setSessionId(sessionId);
			userSessionRepository.save(s);
		}
	}
}
