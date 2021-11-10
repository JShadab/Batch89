package com.shad.shopping.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.shad.shopping.enity.Customer;
import com.shad.shopping.enity.Login;
import com.shad.shopping.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer")
	public String saveCustomer(Customer customer) {
		 customerService.saveCustomer(customer);
		 
		 return "redirect:/login";
	}

	@PostMapping("/login")
	public String getCustomer(Login login) {

		Optional<Customer> optional = customerService.getCustomer(login.getEmail(), login.getPassword());

		if (optional.isPresent()) {
			return "dashboard";
		} else {
			return "redirect:/login";
		}
	}

	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}

	@GetMapping("/register")
	public String getRegisterPage() {
		return "register";
	}
}
