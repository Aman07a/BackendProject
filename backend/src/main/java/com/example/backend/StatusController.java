package com.example.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
	
	@RequestMapping(value = "status")
	public String status() {
		return "OK";
	}
	
	@RequestMapping(value = "person")
	public Person person() {
		Person p = new Person();
		p.setFirstName("Aman");
		p.setLastName("Ahmed");
		return p;
	}
}
