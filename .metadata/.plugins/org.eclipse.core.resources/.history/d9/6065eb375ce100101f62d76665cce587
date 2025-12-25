package in.ashokit;

import in.ashokit.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    private final UserService userService;

    Application(UserService userService) {
        this.userService = userService;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		UserService userService = context.getBean(UserService.class);
		userService.getName(1);
	}

}
