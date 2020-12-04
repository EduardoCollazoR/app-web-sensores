package com.system.count.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "USUARIOS")
public class Usuarios implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5168954054489116047L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;
	
	@Column
	private String rol;
	
	@Column
	private String nombre;
	
	@Column 
	private String apellido;
	
	@Column
	private String email;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	public Usuarios() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param rol
	 * @param nombre
	 * @param apellido
	 * @param email
	 * @param username
	 * @param password
	 */
	public Usuarios(String rol, String nombre, String apellido, String email, String username, String password) {
		super();
		this.rol = rol;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", rol=" + rol + ", nombre=" + nombre + ", apellido=" + apellido + ", email="
				+ email + ", username=" + username + ", password=" + password + "]";
	}
	
	
	

}
