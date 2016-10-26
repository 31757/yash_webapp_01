package ecommerce.yash_webapp_01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ecommerce.yash_webapp_01.dao.UserDAO;
import ecommerce.yash_webapp_01.model.User;

@Controller
public class UserController {
	@Autowired
	UserDAO r ;
	@RequestMapping(value = "/reg")
	public String gotreg(Model model){
		model.addAttribute("user", new User());
		return "reg";
	}

	@PostMapping(value = "yash_webapp_01/index")
	public String go(@ModelAttribute ("user") User user1,BindingResult bindingResult, Model model){
		
		
		r.insertUser(user1);	
		
		return "/reg";
	}
}


