package com.freshVotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freshVotes.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);// spring boot will do this function for us, it will find user by username because he has that column

}
