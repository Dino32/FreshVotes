package com.freshVotes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.freshVotes.domain.User;
import com.freshVotes.repositories.UserRepository;
import com.freshVotes.security.Authority;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private PasswordEncoder encoder;
	
	public User save(User user) {
		user.setPassword(encoder.encode(user.getPassword()));		
		
		Authority authority = new Authority();
		authority.setAuthority("ROLE_USER");
		authority.setUser(user);
		user.getAuthorities().add(authority);
		
		return userRepo.save(user);
	}
}
