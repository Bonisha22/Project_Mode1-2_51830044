package com.bankapp.web.controller;

import java.util.Stack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.entities.AppUser;
import com.bankapp.model.service.UserService;
import com.bankapp.web.controller.formbeans.UserFormBean;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(path="appusermgt")
	public String accountMgt(){
		return "appuser_mgt";
	}
	
	@GetMapping(path="allappusers")
	public ModelAndView allAppUser(ModelAndView mv){
		mv.setViewName("all_appusers");
		mv.addObject("appUsers", userService.getAllAppUsers());
		return mv;
		
	}
	
	@GetMapping(path="register")
	public String registration(ModelMap map) {
	    map.addAttribute("userFormBean", new UserFormBean());

	    return "register_form";
	}
	@PostMapping(path="register")
	public String registrationPost(HttpServletRequest req) {
		
		String name=req.getParameter("name").trim();
		String email=req.getParameter("email").trim();
		String password=req.getParameter("password").trim();
		String cpassword=req.getParameter("password").trim();
		String phone=req.getParameter("phone").trim();
		String address=req.getParameter("address").trim();
		
		AppUser user=new AppUser(name, email, password, phone, address, new String[]{"ROLE_CLERK"}, true);
	if(password.equals(cpassword)){
	   userService.addUser(user);
	    return "redirect:/home";
	}
	    else
	    	return "register_form";
	}
	

}
