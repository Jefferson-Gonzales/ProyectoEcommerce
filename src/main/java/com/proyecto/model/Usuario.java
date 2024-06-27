package com.proyecto.model;

public class Usuario {
	private Integer id;
	private String name;
	private String usename;
	private String email;
	private String direction;
	private String phone;
	private String type;
	private String password;
	
	public Usuario() {
		
	}
	
	public Usuario(Integer id, String name, String usename, String email, String direction, String phone, String type,
			String password) {
		this.id = id;
		this.name = name;
		this.usename = usename;
		this.email = email;
		this.direction = direction;
		this.phone = phone;
		this.type = type;
		this.password = password;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", usename=" + usename + ", email=" + email + ", direction="
				+ direction + ", phone=" + phone + ", type=" + type + ", password=" + password + "]";
	}
}
