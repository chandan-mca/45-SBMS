package in.ashokit.controllers;

import in.ashokit.entites.User;
import in.ashokit.services.UserService;

public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		System.out.println("UserController - Constructor...");
		this.userService = userService;
	}

	public void register(User user) {
		userService.userRegistration(user);
		System.out.println("Registartion Completed...");
	}

}
