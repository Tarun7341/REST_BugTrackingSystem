package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository userrepository;
	
	@Override
	public List<User> getAll() {
		
		return (List<User>) userrepository.findAll();
	}

	@Override
	public void update(User user) {
		userrepository.save(user);
		
	}

	@Override
	public void addNew(User user) {
		userrepository.save(user);
		
	}

	@Override
	public Optional<User> getOne(Integer id) {

		return userrepository.findById(id);
	}

	@Override
	public boolean delete(Integer id) {
		if(userrepository.existsById(id)) {
		userrepository.deleteById(id);
		return true;
		}
		
		return false;
		
	}

	
}
