package com.freshVotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

	@GetMapping(value = "/")
	public String rootView() {
		return "index";
	}
	
	@GetMapping(value = "/dashboard") // same as requestMapping(value="/dashboard", method = RequestMethod.GET)
	public String dashboard() {
		return "dashboard";
	}
}
