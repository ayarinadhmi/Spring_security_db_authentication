package com.ayari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayari.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
	  Role findByRole(String role);
}
