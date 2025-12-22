package in.ashokit.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UserService {

	public UserService() {
		System.out.println("UserService  ::  Constructor");
	}

}
