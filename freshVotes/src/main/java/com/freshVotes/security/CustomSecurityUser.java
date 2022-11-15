package com.freshVotes.security;

import java.util.HashSet;
import java.util.Set;
import org.springframework.security.core.userdetails.UserDetails;

import com.freshVotes.domain.User;

public class CustomSecurityUser extends User implements UserDetails {

	
	private static final long serialVersionUID = 1406922274990375245L;
	Set<Authority> authorities = new HashSet<>();
	
	public CustomSecurityUser(User user) {
		this.setAuthorities(user.getAuthorities());
		this.setId(user.getId());
		this.setId(user.getId());
		this.setPassword(user.getPassword());
		this.setUsername(user.getUsername());
	}
	
	public CustomSecurityUser() {}

	@Override
	public Set<Authority> getAuthorities() {
		return this.getAuthorities();
	}

	@Override
	public String getPassword() {
		return this.getPassword();
	}

	@Override
	public String getUsername() {
		return this.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
