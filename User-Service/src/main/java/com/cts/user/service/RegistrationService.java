package com.cts.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.user.entity.Register;
import com.cts.user.repo.RegisterRepo;

@Service
public class RegistrationService {
	@Autowired
	private RegisterRepo repo;

	public Register addUser(Register user) {
		
		return repo.save(user);
		
	}

	public Optional<Register> getUserByID(int uId) {
		return repo.findById(uId);
	}
	
	public Iterable<Register> findAll() {
		
		return repo.findAll();
	}
}
