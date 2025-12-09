package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		// starting IOC by giving xml as input
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-beans.xml");

		Engine engine = context.getBean(Engine.class);
		engine.start();
	}
}
