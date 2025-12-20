package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.securities.AppSecurity;

@Configuration
public class AppConfig {
	
	@Bean
	public AppSecurity createAppSecurity() {
		System.out.println("AAppSecurity - createAppSecurity() method called... ");
		return new AppSecurity("AES Algorithims");
	}

}
