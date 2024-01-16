package com.pravin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pravin.db1.entity.User;
import com.pravin.db1.repository.UserRepository;
import com.pravin.db2.entity.Contact;
import com.pravin.db2.repository.ContactRepository;

@RestController
public class ContactrestController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ContactRepository contactRepository ;

	@PostMapping("/data")
	public	String save(){
		userRepository.save(new User(1,"pravin","pravin@gmail" ));
		contactRepository.save(new Contact(1,"pravin","pravin@gmail" ));
		return "added succesfully";
		
	}
	
	@GetMapping("/contactlist")
	 public  List<Contact> getAllcontact(){
	 return contactRepository.findAll();
	
	}
	@GetMapping("/Userlist")
	 public  List<User> getAllUser(){
	 return userRepository.findAll();
	
	}
}
