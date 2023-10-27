package com.project.mongodbproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.mongodbproject.domain.User;
import com.project.mongodbproject.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){		
		return repo.findAll();
		
	}

}
