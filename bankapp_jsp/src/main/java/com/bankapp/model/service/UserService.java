package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.entities.AppUser;

public interface UserService {
	
	public AppUser findByEmail(String email);
	public void addUser(AppUser user);
	public List<AppUser> getAllAppUsers();
	
	public void blockUser(Long userId);
	public void deleteUser(Long userId);

}
