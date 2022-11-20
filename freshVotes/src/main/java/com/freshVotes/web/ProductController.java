package com.freshVotes.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.freshVotes.domain.Product;
import com.freshVotes.domain.User;
import com.freshVotes.repositories.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/products")
	public String getProducts(ModelMap model) {
		return "product";
	}
	
	@GetMapping("/products/{productId}")
	public String getProduct(@PathVariable Long productId) {
		return "product";
	}
	
	@PostMapping("/products")
	public String createProduct(@AuthenticationPrincipal User user) {
		Product product = new Product();
		
		product.setPublished(false);
		product.setUser(user);
		
		product = productRepository.save(product);
		
		return "redirect:/products/" + product.getId();
	}
}
