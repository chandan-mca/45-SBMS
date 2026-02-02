package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	public MsgController() {
		System.out.println("MsgController  ::  Constructor");
	}

	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		
		ModelAndView mav = new ModelAndView();
		
		//Setting data in the form of key-value pair
		mav.addObject("msg", "Good Morning");
		
		//Setting the view name
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		
		//Setting data in the form of key-value pair
		mav.addObject("msg", "Welcome to Ashok IT");
		
		//Setting the view name
		mav.setViewName("index");
		
		return mav;
	}

}
