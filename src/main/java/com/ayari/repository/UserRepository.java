package com.ayari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayari.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {	 
	 User findByEmail(String email);
	 
	 User findByUserName(String userName);
	 Boolean existsByUserName(String userName);
	 Boolean existsByEmail(String email);
}
