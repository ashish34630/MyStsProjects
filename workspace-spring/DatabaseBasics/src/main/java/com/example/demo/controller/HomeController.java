package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;

@RestController
public class HomeController {
	
	@Autowired
	StudentRepo studentRepo;
	
	@PostMapping(value = "save")
	public void SaveObject(@RequestBody Student  student)
	{
		
		studentRepo.save(student);
		
	}
	
	
	

}
