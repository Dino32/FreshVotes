package com.freshVotes.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.freshVotes.domain.Product;
import com.freshVotes.domain.User;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByUser(User user);
	
	@Query("select p from Product p join fetch p.user where p.id = :id")
	Optional<Product> findByIdWithUser(Long id);

}
