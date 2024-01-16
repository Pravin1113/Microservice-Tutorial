package com.pravin.db2.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="Contacts")
public class Contact {
	
	@Id
	@GeneratedValue
	private int cid;
	private String name;
	private String email;
	
	public Contact(int i, String string, String string2) {
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
		return "Contact [cid=" + cid + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
