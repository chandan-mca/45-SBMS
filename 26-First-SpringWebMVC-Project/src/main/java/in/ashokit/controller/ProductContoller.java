package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductContoller {

	public ProductContoller() {
		System.out.println("ProductContoller  ::  Constructor");
	}
	
	@GetMapping("/product")
	public ModelAndView getGreetMsg() {
		
		ModelAndView mav = new ModelAndView();
		
		//Setting data in the form of key-value pair
		mav.addObject("price", "Apple Iphone Price :: 65000 INR");
		
		//Setting the view name
		mav.setViewName("productPage");
		
		return mav;
	}
}
