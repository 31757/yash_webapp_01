package ecommerce.yash_webapp_01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ecommerce.yash_webapp_01.dao.*;
import ecommerce.yash_webapp_01.model.*;

@Controller
@RequestMapping("/reg")
public class UserController {
	@Autowired
	UserDAO r;

	@RequestMapping(value = "/new")
	public ModelAndView usrProduct() {
		ModelAndView mv = new ModelAndView("signin");
		mv.addObject("usr", new User());
		return mv;
	}

	@RequestMapping("/save")
	public String editUser(@ModelAttribute("user") User usr) {
		if (usr.getUid() == 0) {
			r.insertUser(usr);
		} 
		else {
		}
		return ("redirect:/reg/new");

	}

}
