package com.pravin.db1.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue
	private int cid;
	private String name;
	private String email;
	
	public User(int i, String string, String string2) {
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	
	@Override
	public String toString() {
		return "User [cid=" + cid + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
