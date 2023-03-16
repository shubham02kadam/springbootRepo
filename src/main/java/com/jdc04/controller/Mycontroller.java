package com.jdc04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdc04.entity.Courses;
import com.jdc04.service.courseservice;

@RestController
public class Mycontroller {
	@Autowired
	private courseservice courseservice;
	
	@GetMapping("/home")
	public String home() {
		
		return "Welcome to home";
		
	}
	@GetMapping("/courses")
	public List<Courses>getcourses(){
		
		return this.courseservice.getcourses();
		
	}
	@GetMapping("/courese/{Id}")
	public Courses getcourse(@PathVariable String id) {
		
		return this.courseservice.getcourses(Long.parseLong(id));
		
		
	}
	@PostMapping("/courses")
	public Courses addcourses(@RequestBody Courses courses) {
		
		return this.courseservice.addcourses(courses);
	}
	

}
