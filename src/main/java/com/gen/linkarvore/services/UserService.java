package com.gen.linkarvore.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gen.linkarvore.models.User;
import com.gen.linkarvore.repositories.UserRepository;
import com.gen.linkarvore.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
	}
	
	public List<User> list() {
		return repository.findAll();
	}
//	
//	public User register(User user) {
//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//
//		String passEncoder = encoder.encode(user.getPassword());
//		user.setPassword(passEncoder);
//
//		return repository.save(user);
//	}
}
