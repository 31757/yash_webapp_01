package ecommerce.yash_webapp_01.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import ecommerce.yash_webapp_01.dao.ProductDAO;
import ecommerce.yash_webapp_01.model.ProductModel;

@Controller
@RequestMapping("/pro")

public class ProductController {
	@Autowired
	ProductDAO p;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView adminProduct() {
		ModelAndView mv = new ModelAndView("productview");
		// ProductModel product = new ProductModel();
		mv.addObject("products", p.getAll());
		mv.addObject("product", new ProductModel());
		return mv;
	}

	@RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
	public ModelAndView getProduct(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("productview");
		mv.addObject("product", p.get(id));
		mv.addObject("products", p.getAll());
		return mv;
	}

	@RequestMapping(value = "/delete/{pro}")
	public String deleteProduct(@PathVariable("pro") Integer id) {
		p.delete(id);
		return "redirect:/pro/view";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String editProduct(@Valid @ModelAttribute("product") ProductModel prod, BindingResult results,
			HttpServletRequest request, Model model) {

		if (results.hasErrors()) {
			model.addAttribute("product", prod);
			model.addAttribute("productData", p.getAll());
			return ("adminProduct");
		}
		if (prod.getPid() == 0) {
			// ................................... multi part starts
			// here....................

			// need to have a transient field of type MultipartFile in Product
			// model class
			MultipartFile productImage = prod.getFile();
			// first get the root directory and then append the directory where
			// you want to store
			String rootPath = request.getSession().getServletContext().getRealPath("/");
			String directoryPath = rootPath + "resources\\images\\product";
			// append the file name
			String filePath = directoryPath + File.separator + prod.getPid() + ".jpg";

			// ========================================================
			// If directory does not exist create the directory
			if (!Files.exists(Paths.get(directoryPath))) {
				try {
					// create the directories recursively
					Files.createDirectories(Paths.get(directoryPath));
				}

				catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			// =======================================================
			// transfer the file

			try {
				productImage.transferTo(new File(filePath));
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			// ................................... ends
			// here..................................
			p.insert(prod);
		} else {
			p.update(prod);
		}
		return ("redirect:/pro/view");
	}
}
