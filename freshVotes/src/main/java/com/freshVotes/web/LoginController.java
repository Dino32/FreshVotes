package com.freshVotes.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.freshVotes.domain.User;
import com.freshVotes.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	//@RequestMapping(value = "/login", method = RequestMethod.GET)
	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@GetMapping(value = "/register")
	public String register(ModelMap model) {
		model.put("user", new User());
		return "register";
	}
	
	@PostMapping(value = "/register")
	public String registerPost(@ModelAttribute User user) {
		User savedUser = userService.save(user);
		return "redirect:/login";
	}
}
