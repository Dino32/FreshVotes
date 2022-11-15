package com.freshVotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String rootView() {
		return "index";
	}
	
	@GetMapping(value = "/dashboard") // same as requestMapping(value="/dashboard", method = RequestMethod.GET)
	public String dashouard() {
		return "dashboard";
	}
}
