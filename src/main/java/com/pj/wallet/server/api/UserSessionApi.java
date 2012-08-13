package com.pj.wallet.server.api;

public interface UserSessionApi {

	void userLoggedIn(long userId, String sessionId);

	void userLoggedOut(long userId, String sessionId);

}
