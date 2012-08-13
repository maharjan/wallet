package com.pj.wallet.server.api;

import com.pj.wallet.server.exception.ClientException;
import com.pj.wallet.server.web.model.RegistrationModel;

public interface UserRegistrationApi {

	void registerUser(RegistrationModel model) throws ClientException;

}
