package com.shad.shopping.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shad.shopping.enity.Customer;
import com.shad.shopping.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Optional<Customer> getCustomer(String email, String password) {
		return customerRepository.findByEmailAndPassword(email, password);
	}

}
