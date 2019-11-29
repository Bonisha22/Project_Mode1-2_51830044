package com.bankapp.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.entities.Customer;
import com.bankapp.model.repo.CustomerRepository;
import com.bankapp.model.service.AccountService;
import com.bankapp.model.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path="customermgt")
	public String accountMgt(){
		return "customer_mgt";
	}
	
	@GetMapping(path="allcustomers")
	public ModelAndView allAccount(ModelAndView mv){
		mv.setViewName("all_customers");
		mv.addObject("customers", customerService.getAllCustomers());
		return mv;
		
	}
	@GetMapping(path="addcustomer")
	public String AddCustomerGet(ModelMap map) {
		map.addAttribute("customer", new Customer());
		return "addcustomer";
	}

	@PostMapping(path="addcustomer")
	public String AddCustomerPost(@Valid Customer customer, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "addcustomer";
		} else {
			if (customer.getId() == null)
				customerService.addCustomer(customer);
			else
				customerService.update(customer);
			return "redirect:allcustomers";

		}
	}

	@GetMapping(path="delete")
	public String deleteCustomer(HttpServletRequest req) {
		Long customerId = Long.parseLong(req.getParameter("id"));
		customerService.delete(customerId);
		return "redirect:allcustomers";
	}

	@GetMapping(path="update")
	public String updateCustomer(HttpServletRequest req, ModelMap map) {
		Long customerId = Long.parseLong(req.getParameter("id"));
		Customer customerToBeUpdated = customerService.getCustomerById(customerId);
		map.addAttribute("customer", customerToBeUpdated);
		return "addcustomer";
	}
	


}
