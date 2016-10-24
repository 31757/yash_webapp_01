package ecommerce.yash_webapp_01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ecommerce.yash_webapp_01.dao.RegistrationDAO;
import ecommerce.yash_webapp_01.model.RegistrationModel;

@RequestMapping("/signin")
@Controller
public class SignupController {
	@Autowired
	RegistrationDAO r ;
	@RequestMapping(value = "/reg")
	public String gotreg(Model model){
		model.addAttribute("user", new RegistrationModel());
		return "reg";
	}

	@PostMapping(value = "/in")
	public String go(@ModelAttribute ("user") RegistrationModel user1,BindingResult bindingResult, Model model){
		
		
		r.insert(user1);	
		
		return "/reg";
	}
}