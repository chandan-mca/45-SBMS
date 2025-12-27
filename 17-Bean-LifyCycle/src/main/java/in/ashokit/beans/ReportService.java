package in.ashokit.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ReportService {

	public ReportService() {
		System.out.println("ReportService :: Constructor...");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("ReportService  :: init() called...");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("ReportService  :: destroy() called...");
	}
}
