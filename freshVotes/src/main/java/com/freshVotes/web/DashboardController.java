package com.freshVotes.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.freshVotes.domain.Product;
import com.freshVotes.domain.User;
import com.freshVotes.repositories.ProductRepository;

@Controller
public class DashboardController {
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping(value = "/")
	public String rootView() {
		return "index";
	}
	
	@GetMapping(value = "/dashboard") // same as requestMapping(value="/dashboard", method = RequestMethod.GET)
	public String dashboard(@AuthenticationPrincipal User user, ModelMap model) {
		
		List<Product> products = productRepository.findByUser(user);
		
		model.put("products", products);
		
		return "dashboard";
	}
	
}
