package com.cg.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class User implements Serializable 
{
	private static final long serialVersionUID=1L;
	@Id
	private int id;
	private String name;
	private String type;
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	
	//getters and setters method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
}
