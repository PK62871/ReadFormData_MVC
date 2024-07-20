package springmvc.controller;

import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/contact")
	public String viewFormPage() {
		return "contact";
	}

	 //@RequestMapping(path = "/registration",method = RequestMethod.POST)
  //public String recieveData(HttpServletRequest request,Model model) {
		
		
		// 1st Way to read form data
//		String email = request.getParameter("email");
//		System.out.println(email);
//		
//		String userName = request.getParameter("userName");
//		System.out.println(userName);
//		
//		
//		String password = request.getParameter("password");
//		
//		System.out.println(password);
//		model.addAttribute("name",userName);
//		model.addAttribute("email",email);
//		model.addAttribute("password",password );
//		return "success";
		
		
	

	// 2nd Way to read From Data By USing @RequestParam.
	
//	@RequestMapping(path = "/registration",method = RequestMethod.POST)
//	public String recieveData(
//			@RequestParam("email") String email,
//			@RequestParam("userName")String userName,
//			@RequestParam("password") String password,
//			Model model
//			) {
//		
//		User user = new User();
//		user.setEmail(email);
//		user.setUserName(userName);
//		user.setPassword(password);
//		
//		System.out.println(user);
//		model.addAttribute("user",user);
//		
//		System.out.println(email);
//		System.out.println(userName);
//		System.out.println(password);
//		model.addAttribute("name",userName);
//		model.addAttribute("email",email);
//		model.addAttribute("password",password);
//		return "success";

	
	
	// 3rd Way to read From Data By USing @ModelAttribute.
	@RequestMapping(path = "/registration", method = RequestMethod.POST)
	public String recieveData(@ModelAttribute User user,Model model) {
		System.out.println(user);
		model.addAttribute("user",user);
		return "success";

	}
}
