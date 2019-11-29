package com.bankapp.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.entities.Account;
import com.bankapp.model.repo.AccountRepository;
import com.bankapp.model.service.AccountService;
import com.bankapp.model.service.exception.AccountNotFoundException;
import com.bankapp.web.controller.formbeans.AccountTransferBean;
import com.bankapp.web.controller.formbeans.TransactionBean;

@Controller
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping(path="accountmgt")
	public String accountMgt(){
		return "account_mgt";
	}
	
	@GetMapping(path="allaccounts")
	public ModelAndView allAccount(ModelAndView mv){
		mv.setViewName("all_accounts");
		mv.addObject("accounts", accountService.getAllAccounts());
		return mv;
		
	}
	@GetMapping(path="deposit")
	public String depositGet(ModelMap map) {
		map.addAttribute("transactionBean", new TransactionBean());

		return "deposit_form";

	}

	@PostMapping(path="deposit")
	public String depositPost(@Valid @ModelAttribute(value = "transactionBean") TransactionBean transactionBean,
			HttpServletRequest req, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "deposit_form";
		}

		accountService.deposit(transactionBean.getFromAccount(), transactionBean.getAmount());

		return "redirect:allaccounts";
	}

	@GetMapping(path="withdraw")
	public String withdrawGet(ModelMap map) {
		map.addAttribute("transactionBean", new TransactionBean());

		return "withdraw_form";

	}

	@PostMapping(path="withdraw")
	public String withdrawPost(@Valid @ModelAttribute(value = "transactionBean") TransactionBean transactionBean,
			HttpServletRequest req, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "withdraw_form";
		}

		accountService.withdraw(transactionBean.getFromAccount(), transactionBean.getAmount());

		return "redirect:allaccounts";
	}

	@GetMapping(path="transfer")
	public String transferGet(ModelMap map) {
		map.addAttribute("accountTransferBean", new AccountTransferBean());

		return "transfer_form";

	}

	@PostMapping(path="transfer")
	public String transferPost(ModelMap map, HttpServletRequest req) {

		Long fromAcc = Long.parseLong(req.getParameter("fromAccount").trim());
		Long toAcc = Long.parseLong(req.getParameter("toAccount").trim());
		double amount = Double.parseDouble(req.getParameter("amount").trim());
		accountService.transfer(fromAcc, toAcc, amount);

		return "redirect:allaccounts";
	}

	
	
	
	
	
	
}
