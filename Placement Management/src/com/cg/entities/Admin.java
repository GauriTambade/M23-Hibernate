package com.cg.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Admin  implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@OneToOne(cascade=CascadeType.ALL)
	//@GeneratedValue(strategy=GenerationType.AUTO)	
	private long id;
	private String name;
	private String password;
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
