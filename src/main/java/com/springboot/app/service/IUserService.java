package com.springboot.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot.app.entity.User;

public interface IUserService {
	
	public Iterable<User> findAll(); //Este metodo devolvera un iterable de usuario es decir devolvera todos los usuarios iterados 
	
	public Page<User> findAll(Pageable pageable); //Este metodo permite la paginacion
	
	public Optional<User> findById(Long id); //Este metodo devolvera un opcional de usuario, para esto es necesario indicar un id
	
	public User save(User user); //Este metodo nos permitira registrar un usuario nuevo ingresando un usuario de tipo user
	
	public void deleteById(Long id); //Este metodo no nos devolvera nada, pero borrara un registro mediante el id que especifiquemos
	

}
