package com.gen.linkarvore.models;

public class UserLogin {

	private long id;

	private String name;

	private String email;

	private String password;

	private String token;

	private int type;

	public UserLogin() {
		super();
	}

	public UserLogin(long id, String name, String email, String password, String token, int type) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.token = token;
		this.type = type;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
