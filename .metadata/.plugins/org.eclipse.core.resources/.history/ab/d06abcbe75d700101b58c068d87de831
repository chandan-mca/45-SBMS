package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.entites.User;
import in.ashokit.services.UserService;

public class Test {
	public static void main(String[] args) {

		// starting IOC by giving xml as input
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");

		User user = new User("chandan", "password", "cagrawal0012@gmail.com");
		
		UserService userService = context.getBean(UserService.class);
		userService.userRegistration(user);
	}
}
