package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.dao.UserDao;
import in.ashokit.services.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserDao userDao1 = context.getBean(UserDao.class);
		System.out.println("userDao1: " + userDao1.hashCode());
		
		UserDao userDao2 = context.getBean(UserDao.class);
		System.out.println("userDao2: " + userDao2.hashCode());
		
		UserService userService1 = context.getBean(UserService.class);
		System.out.println("userService1: " + userService1.hashCode());
		
		UserService userService2 = context.getBean(UserService.class);
		System.out.println("userService2: " + userService2.hashCode());
		
	}

}
