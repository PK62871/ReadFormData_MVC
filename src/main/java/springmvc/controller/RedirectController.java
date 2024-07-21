package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	// 1st Way to redirect.
//	@RequestMapping("/first")
//	public String first() {
//		System.out.println("First Method");
//		return "redirect:/second";
//	}
	
	
	//2nd Way to redirect.
	@RequestMapping("/first")
	public RedirectView redirect() {
		RedirectView view = new RedirectView();
		view.setUrl("https://www.w3school.com");
		return view;
		
	}
	
	@RequestMapping("/second")
	public String second() {
		System.out.println("Second Method");
		return "contact";
	}
}
