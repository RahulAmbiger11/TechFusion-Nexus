package com.techFusionNexus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techFusionNexus.entities.Users;
import com.techFusionNexus.repositories.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService {

	@Autowired
	UsersRepository repo;
	@Override
	public String addUser(Users user) {
		repo.save(user);
		return "user added!";
	}
	@Override
	public Users findUserByEmail(String email) {
		return repo.findByEmail(email);
	}
	@Override
	public boolean checkEmail(String email) {
		return repo.existsByEmail(email);
	}
	@Override
	public String saveUsers(Users user) {
		repo.save(user);
		return "user updated";
	}
	
}
