package com.shad.SpringMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shad.SpringMvc.model.Product;
import com.shad.SpringMvc.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/addProduct")
	public String getAddProductPage() {
		return "AddProduct";
	}

	@PostMapping("/addProduct")
	@ResponseBody
	public String addProduct(Product product) {

		// save Product in DB
		return productService.saveProduct(product);

	}

	@GetMapping("/displayProducts")
	public ModelAndView getAllProducts() {

		List<Product> allProduct = productService.getAllProduct();

		ModelAndView modelAndView = new ModelAndView("DisplayProduct");
		modelAndView.addObject("allProduct", allProduct);

		return modelAndView;
	}

}
