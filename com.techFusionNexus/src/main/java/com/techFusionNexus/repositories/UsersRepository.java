package com.techFusionNexus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techFusionNexus.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	Users findByEmail(String email);
	boolean existsByEmail(String email);

}
