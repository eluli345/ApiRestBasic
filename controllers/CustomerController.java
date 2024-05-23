package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

import com.example.demo.domain.Customer;

@RestController
public class CustomerController {
	
	private List<Customer> customers = new ArrayList<>(Arrays.asList(
				new Customer(01, "Ana", "Cleta", "1234"),
				new Customer(02, "Anuar", "Cleto", "4321"),
				new Customer(03, "Miguel", "MigelO", "1235"),
				new Customer(04, "Pedro", "Santo3", "5321")
				
			));
	@GetMapping("Clients")
	public List<Customer> getCustomers(){
		return customers;
	}
	@GetMapping("Clients/{username}")
	public Customer getClient(@PathVariable String username) {
		for(Customer c : customers) {
			if (c.getUsername().equalsIgnoreCase(username)) {
				return c;
			}
		}
		
		return null;
		
	}
	
	
}
