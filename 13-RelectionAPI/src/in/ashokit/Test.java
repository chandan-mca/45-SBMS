package in.ashokit;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {
		
		//1. Load the class into JVM
		Class<?> cls = Class.forName("in.ashokit.User");
		
		//2. Load the variable from class
		Field field = cls.getDeclaredField("age");
		field.setAccessible(true);
		
		//3. Creating object
		Object obj = cls.newInstance();
		
		//4. Setting value for variable
		User user = (User) obj ;
		field.set(user, 30);
		
		//5. calling method to print age value
		user.printAge();
		
	}

}
