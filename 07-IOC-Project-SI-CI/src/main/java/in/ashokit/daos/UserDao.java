package in.ashokit.daos;

import in.ashokit.entites.User;

public class UserDao {

	public UserDao() {
		System.out.println("UserDao - Constructor...");
	}
	
	public void saveUserData(User user) {
		System.out.println("Data saved in Database Successfully...");
	}
	
	

}
