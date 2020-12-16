package com.springbootrestapplication.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestapplication.dao.CustomerRepository;
import com.springbootrestapplication.model.Customer;

@RestController
public class MainController {

	@Autowired 

	CustomerRepository customerRepository; 

	 

	@GetMapping("/display/{id}") 

	public Optional<Customer> fetchCustomerById( @PathVariable("id") long id){ 

	Optional<Customer> customer = Optional.of(new Customer()); 

	 

	customer = customerRepository.findById(id); 

	 

	return customer; 

	} 

	 

	@PostMapping("/save") 

	public String saveNewCustomer(@RequestBody Customer apiCustomer) { 

	Customer customer = new Customer(); 

	customer = customerRepository.save(apiCustomer); 

	return "Customer Added"; 

	} 

	 

	@PutMapping("/update") 

	public String updateCustomer(@RequestBody Customer apiCustomer) { 

	Customer customer = new Customer(); 

	customer = customerRepository.save(apiCustomer); 

	return "Customer Updated"; 

	} 

	 

	@DeleteMapping("/delete/{id}") 

	public String deleteById( @PathVariable("id") long id){ 

	Customer customer = new Customer(); 

	 

	customer = customerRepository.getOne(id); 

	customerRepository.delete(customer); 

	 

	return "Customer Deleted"; 

	 

	} 
	
}
