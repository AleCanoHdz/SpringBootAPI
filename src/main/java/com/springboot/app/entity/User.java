package com.springboot.app.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Esta anotacion de spring permite que el freamwork reconozca la clase como una entidad(modelo).
@Table(name = "users") //Esta anotacion permite que se mapee la tabla en la base de datos especificando su nombre
public class User implements Serializable{
	
	
	private static final long serialVersionUID = -6468805260790837158L;
	
	@Id //Esta anotacion se coloca antes del identificador unico de la entidad
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Esta anotacion indica que el valor del id se generara bajo la estrategia de identity
	private long id;
	
	@Column(length = 50) //Esta anotacion permite especificar datos de las columnas, como por ejemplo la longitud 
	private String name;
	
	@Column(nullable=false, length = 50)
	private String surname;
	
	@Column(name= "mail", unique=true)
	private String email;
	
	private Boolean enabled;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	
	

}
