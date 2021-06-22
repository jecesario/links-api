package com.gen.linkarvore.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	private long id;

	@NotBlank(message = "O campo nome deve ser preenchido")
	private String name;

	@NotBlank(message = "O campo email deve ser preenchido")
	@UniqueElements
	private String email;

	@NotBlank(message = "O campo senha deve ser preenchido")
	private String password;

	private int type;

	@OneToMany(mappedBy = "user")
	private List<Page> pages = new ArrayList<>();

	public User() {
		super();
	}

	public User(long id, @NotBlank(message = "O campo nome deve ser preenchido") String name,
			@NotBlank(message = "O campo email deve ser preenchido") @UniqueElements String email,
			@NotBlank(message = "O campo senha deve ser preenchido") String password, int type, List<Page> pages) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.type = type;
		this.pages = pages;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

}
