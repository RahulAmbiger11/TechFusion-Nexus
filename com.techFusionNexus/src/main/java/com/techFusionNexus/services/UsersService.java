package com.techFusionNexus.services;

import com.techFusionNexus.entities.Users;

public interface UsersService {
	String addUser(Users user);
	Users findUserByEmail(String email);
	boolean checkEmail(String email);
	
	String saveUsers(Users user);

}
