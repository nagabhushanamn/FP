package com.component;

import com.container.RequestMapping;
import com.container.RequestMethod;


public class UserController {

	@RequestMapping(url = "/login", method = RequestMethod.POST)
	public void doLogin() {
		System.out.println("UserController::doLogin()");
	}

	@RequestMapping(url = "/register", method = RequestMethod.POST)
	public void doRegister() {
		System.out.println("UserController::doRegister()");
	}

}
