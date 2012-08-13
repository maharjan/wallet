package com.pj.wallet.server.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pj.wallet.server.api.UserRegistrationApi;
import com.pj.wallet.server.exception.ClientException;
import com.pj.wallet.server.web.model.RegistrationModel;


@Controller
public class RegistrationController {
	private UserRegistrationApi userRegistrationApi;

	public RegistrationController(UserRegistrationApi userRegistrationApi) {
		this.userRegistrationApi = userRegistrationApi;
	}

	@ModelAttribute("user")
	public RegistrationModel getUser() {
		return new RegistrationModel();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/registration")
	public String getRegistration(ModelMap map,
			@RequestParam(value = "success", required = false) String success,
			@RequestParam(value = "failure", required = false) String failure) {
		map.put("success", success);
		map.put("failure", failure);
		return "registration";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public String register(@Valid @ModelAttribute("user") RegistrationModel model,
			BindingResult bindingResult, HttpServletRequest request,
			ModelMap modelMap) {
		if (bindingResult.hasErrors()) {
			return "registration";
		}
		try {
			userRegistrationApi.registerUser(model);
		} catch (ClientException e) {
			return "redirect:/registration?failure=" + e.getMessage();
		}
		return "redirect:/registration?success=registration.success";
	}

}
