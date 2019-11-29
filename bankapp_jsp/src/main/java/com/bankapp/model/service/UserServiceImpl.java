package com.bankapp.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.entities.AppUser;
import com.bankapp.model.repo.AppUserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	public AppUserRepository userRepo;
	

	@Override
	public AppUser findByEmail(String email) {
		
		return userRepo.findByEmail(email);
	}

	@Override
	public void addUser(AppUser user) {
		userRepo.save(user);
		
	}

	@Override
	public List<AppUser> getAllAppUsers() {
		
		return userRepo.findAll();
	}

	@Override
	public void blockUser(Long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		
	}

}
