package in.ashokit.services;

import in.ashokit.daos.UserDao;
import in.ashokit.entites.User;

public class UserService {

	private PasswordService passwordService;

	private EmailService emailService;

	private UserDao userDao;

	public UserService() {
		System.out.println("UserService - Constructor...");
	}

	public void setPasswordService(PasswordService passwordService) {
		this.passwordService = passwordService;
		System.out.println("setPasswordService - Setter Method called...");
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
		System.out.println("setEmailService - Setter Method called...");
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
		System.out.println("setUserDao - Setter Method called...");
	}
	
	public void userRegistration(User user) {
		System.out.println("Registartion Completed...");
		//encrypt the password
		passwordService.passwordEncrypt(user.getPassword());
		
		//Save user in DB
		userDao.saveUserData(user);
		
		//Email sent to user
		emailService.emailSent(user.getEmail());
		
	}

}
