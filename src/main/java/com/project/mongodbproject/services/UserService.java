package com.project.mongodbproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.mongodbproject.domain.User;
import com.project.mongodbproject.repository.UserRepository;
import com.project.mongodbproject.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){		
		return repo.findAll();	
	}
	
	public User findById(String id) throws ObjectNotFoundException {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
	

}
