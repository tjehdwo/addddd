package com.kh.springdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.kh.springdb.service.CustomerService;
import com.kh.springdb.vo.Customer;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	private final CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping
	public String getAllCustomers(Model model) {
		List<Customer> customers = customerService.getAllCustomers();
		model.addAttribute("customers",customers);
		return "customerList";
	}
	
	@GetMapping("/new")
	public String displayCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customerForm";
	}
	
	@PostMapping("/save")
	public String saveBoard(@ModelAttribute Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/customers";
	}
	
	@GetMapping("/delete/{customer_id}")
	public String deleteCustomer(@PathVariable Long customer_id) {
		customerService.deleteCustomerById(customer_id);
		return "redirect:/customers";
	}
	
}
