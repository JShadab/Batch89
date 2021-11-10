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
	public Customer saveCustomer(Customer customer) {
		return customerService.saveCustomer(customer);
	}
	@PostMapping("/login")
	public Optional<Customer> getCustomer(Login login) {
		return customerService.getCustomer(login.getEmail(), login.getPassword());
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
