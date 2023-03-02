package com.springboot.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.entity.User;
import com.springboot.app.repository.UserRepository;



@Service
public class UserService implements IUserService {
	
	@Autowired //Esta anotacion nos permite la inyeccion de dependencias del respository en este caso
	private UserRepository userRepository;

	@Override
	@Transactional(readOnly = true) //Esto nos indica que es un metodo transaccional de solo lectura y no creara cambios en la base de datos
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<User> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return userRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	@Transactional //Al colocar solo Transactional indicamos que si habra cambios en la base de datos
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		
	}

}
