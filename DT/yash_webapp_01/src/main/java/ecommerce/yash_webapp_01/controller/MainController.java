package ecommerce.yash_webapp_01.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	
	@RequestMapping(value={"/home", "/index","/"})
	public ModelAndView gotoindex()
	{
 ModelAndView mvc=new ModelAndView();
 mvc.setViewName("index");
 return mvc;
	}
	
	@RequestMapping(value={"/about"})
	public ModelAndView gotoabout()
	{
 ModelAndView mvc=new ModelAndView();
 mvc.setViewName("about");
 return mvc;
	}
	
	@RequestMapping(value={"/signin"})
	public ModelAndView gotosignin()
	{
 ModelAndView mvc=new ModelAndView();
 mvc.setViewName("signin");
 return mvc;
	}
	@RequestMapping(value={"/cart"})
	public ModelAndView gotocart()
	{
 ModelAndView mvc=new ModelAndView();
 mvc.setViewName("cart");
 return mvc;
	}
	
 @RequestMapping(value={"/login"})
	public ModelAndView gotologin()
	{
 ModelAndView mvc=new ModelAndView();
 mvc.setViewName("login");
 return mvc;
 
      }
	
	@RequestMapping(value={"/contact"})
	public ModelAndView gotocontact()
	{
 ModelAndView mvc=new ModelAndView();
 mvc.setViewName("contact");
 return mvc;
	
      }

	@RequestMapping(value={"/Product"})
	public ModelAndView gotoProduct()
	{
 ModelAndView mvc=new ModelAndView();
 mvc.setViewName("Product");
 return mvc;
	
	
      }
	
	@RequestMapping(value={"/viewdetails"})
	public ModelAndView gotoviewall()
	{
 ModelAndView mvc=new ModelAndView();
 mvc.setViewName("viewall");
 return mvc;
	
      }
	
	@RequestMapping(value={"/loginadmin"})
	public ModelAndView gotologinadmin()
	{
 ModelAndView mvc=new ModelAndView();
 mvc.setViewName("loginadmin");
 return mvc;
	} 
	
	@RequestMapping(value={"/pro/view"})
	public ModelAndView gotopro()
	{
 ModelAndView mvc=new ModelAndView();
 mvc.setViewName("pro");
 return mvc;
	} 
	
	@RequestMapping(value={"/prodform"})
	public ModelAndView gotoprodform()
	{
 ModelAndView mvc=new ModelAndView();
 mvc.setViewName("prodform");
 return mvc;
	} 
	@RequestMapping(value={"/viewform"})
	public ModelAndView gotoviewform()
	{
 ModelAndView mvc=new ModelAndView();
 mvc.setViewName("viewform");
 return mvc;
	} 
	
}


