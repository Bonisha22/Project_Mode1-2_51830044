package com.bankapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@GetMapping(path="mylogin")
	public String login(){
		return "mylogin";
	}
	@GetMapping(path="/")
	public String index(){
		return "redirect:/home";
	}
	
	@GetMapping(path="home")
	public String home(){
		return "home";
	}
	
	@GetMapping(path="accessdenied")
	public String accessDenied(){
		return "403";
	}
	@GetMapping(path="admin")
	public ModelAndView admin(ModelAndView mv){
		mv.setViewName("admin_home");
		mv.addObject("info", "Hello Admin");
		return mv;
	}
	@GetMapping(path="clerk")
	public ModelAndView mgr(ModelAndView mv){
		mv.setViewName("clerk_home");
		mv.addObject("info", "Hello Clerk");
		return mv;
	}
	@GetMapping(path="mgr")
	public ModelAndView manager(ModelAndView mv){
		mv.setViewName("mgr_home");
		mv.addObject("info", "Hello Manager");
		return mv;
	}
	

}
