package com.pj.wallet.server.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pj.wallet.server.auth.Authorities;
import com.pj.wallet.server.util.AuthenticationUtil;


@Controller
public class MainController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String getLogin(ModelMap map) {
		if (AuthenticationUtil.getCurrentUser() != null) {
			if (AuthenticationUtil.getCurrentUser().getAuthority().equals(Authorities.ROLE_USER)) {
				return "redirect:/home";
			}
		}
		return "redirect:/login";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String getMain(ModelMap map, @RequestParam(value = "failure", required = false) String failure) {
		map.put("failure", failure);
		return "index";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/home")
	public String getHome(ModelMap map) {
		if (AuthenticationUtil.getCurrentUser() != null) {
			if (AuthenticationUtil.getCurrentUser().getAuthority().equals(Authorities.ROLE_USER)) {
				return "home";
			}
		}
		return "redirect:/login";
	}
}
